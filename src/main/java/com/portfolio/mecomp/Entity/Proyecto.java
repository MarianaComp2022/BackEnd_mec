package com.portfolio.mecomp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
           
    @NotNull
    private String descripcion;
    
    private String proy_url;
    
    private int id_Pers_proy;


//Constructores 

    public Proyecto(){}

    public Proyecto(String nombre, String descripcion, String proy_url, int id_Pers_proy) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proy_url = proy_url;
        this.id_Pers_proy = id_Pers_proy;
    }
        
  // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProy_url() {
        return proy_url;
    }

    public void setProy_url(String proy_url) {
        this.proy_url = proy_url;
    }

    public int getId_Pers_proy() {
        return id_Pers_proy;
    }

    public void setId_Pers_proy(int id_Pers_proy) {
        this.id_Pers_proy = id_Pers_proy;
    }
    
    
    
        
        
}