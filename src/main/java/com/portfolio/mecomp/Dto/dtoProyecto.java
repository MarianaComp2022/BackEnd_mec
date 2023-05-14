package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank 
    private String proy_url;  
    
//Constructores 

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcion, String proy_url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proy_url = proy_url;
    }
    
// Getters and Setters

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
    
    
    
}
