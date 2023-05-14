package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank 
    private String proy_url;  
    
    private int id_Pers_proy;
    
//Constructores 

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcion, String proy_url, int id_Pers_proy) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proy_url = proy_url;
        this.id_Pers_proy = id_Pers_proy;
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

    public int getId_Pers_proy() {
        return id_Pers_proy;
    }

    public void setId_Pers_proy(int id_Pers_proy) {
        this.id_Pers_proy = id_Pers_proy;
    }
    
    
    
}
