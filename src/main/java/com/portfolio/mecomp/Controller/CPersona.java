package com.portfolio.mecomp.Controller;

import com.portfolio.mecomp.Dto.dtoPersona;
import com.portfolio.mecomp.Entity.Persona;
import com.portfolio.mecomp.Security.Controller.Mensaje;
import com.portfolio.mecomp.Service.ImpPersonaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = {"https://mecfrontend.web.app/","http://localhost:4200"})
public class CPersona {
    @Autowired
    ImpPersonaService personaService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id) {
           if(!personaService.existsById(id)){
               return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
           }
           Persona persona = personaService.getOne(id).get();
           return new ResponseEntity(persona, HttpStatus.OK);
    }       
    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!personaService.existsById(id)){
            return new ResponseEntity(new Mensaje("No Existe el ID"), HttpStatus.NOT_FOUND);
        }
        personaService.delete(id);
        return new ResponseEntity(new Mensaje("Educacion Eliminada"), HttpStatus.OK);
    }*/
    
    /*@PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPersona dtopersona){
        if(StringUtils.isBlank(dtopersona.getNombre())){
            return new ResponseEntity(new Mensaje("El Nombre de la Persona es Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(personaService.existsByNombre(dtopersona.getNombre())){
            return new ResponseEntity(new Mensaje("Ese Nombre de Persona ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        Persona persona = new Persona(
                dtopersona.getNombre(), dtopersona.getDescripcion()
        );
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Persona Creada"), HttpStatus.OK);
    }*/
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona){
        if(!personaService.existsById(id)){
            return new ResponseEntity(new Mensaje("No esxiste el ID de Edu"), HttpStatus.NOT_FOUND);
        }
        if(personaService.existsByNombre(dtopersona.getNombre()) && personaService.getByNombre(dtopersona.getNombre()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese Nombre de la Persona ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtopersona.getNombre())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);     
        }
        if(StringUtils.isBlank(dtopersona.getApellido())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);     
        }
        if(StringUtils.isBlank(dtopersona.getDescripcion())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);     
        }
        if(StringUtils.isBlank(dtopersona.getImg())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);     
        }
        
        Persona persona = personaService.getOne(id).get();
        
        persona.setNombre(dtopersona.getNombre());
        persona.setApellido(dtopersona.getApellido());
        persona.setDescripcion(dtopersona.getDescripcion());
        persona.setImg(dtopersona.getImg());
        
        personaService.save(persona);
        return new ResponseEntity(new Mensaje("Persona Actualizada"), HttpStatus.OK);
    }   
    
}