package com.portfolio.mecomp.Controller;

import com.portfolio.mecomp.Dto.dtoProyecto;
import com.portfolio.mecomp.Entity.Proyecto;
import com.portfolio.mecomp.Security.Controller.Mensaje;
import com.portfolio.mecomp.Service.SProyecto;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = {"https://mecfrontend.web.app/","http://localhost:4200"})
public class CProyecto {
    @Autowired
    SProyecto sProyecto;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list() {
           List<Proyecto> list = sProyecto.list();
           return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyecto dtopry){
        if(StringUtils.isBlank(dtopry.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sProyecto.existsByNombre(dtopry.getNombre()))
            return new ResponseEntity(new Mensaje("Ese proyecto existe"), HttpStatus.BAD_REQUEST);
        
        Proyecto proyecto = new Proyecto(dtopry.getNombre(), dtopry.getDescripcion(), dtopry.getProy_url());
        sProyecto.save(proyecto);
        
        return new ResponseEntity(new Mensaje("Proyecto Agregado"), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyecto dtopry){
        //Validamos si existe el ID
        if(!sProyecto.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombres de Proyectos
        if(sProyecto.existsByNombre(dtopry.getNombre())&& sProyecto.getByNombre(dtopry.getNombre()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese proyecto ya existe"), HttpStatus.BAD_REQUEST);
        }
        //El campo no puede estar vacio
        if(StringUtils.isBlank(dtopry.getNombre())){
            return new ResponseEntity(new Mensaje("El Nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Proyecto proyecto = sProyecto.getOne(id).get();
        proyecto.setNombre(dtopry.getNombre());
        proyecto.setDescripcion(dtopry.getDescripcion());
        proyecto.setProy_url(dtopry.getProy_url());
        
        
        sProyecto.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto Actualizado"), HttpStatus.OK);
           
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") int id) {
           if(!sProyecto.existsById(id)){
               return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
           }
           Proyecto proyecto = sProyecto.getOne(id).get();
           return new ResponseEntity(proyecto, HttpStatus.OK);
    }   
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //Validamos si existe el ID
        if(!sProyecto.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        sProyecto.delete(id);
        
        return new ResponseEntity(new Mensaje("Proyecto Eliminado"), HttpStatus.OK);
    }
    
}
