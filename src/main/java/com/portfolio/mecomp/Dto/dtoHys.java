package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHys {
    @NotBlank
    private String tipo;
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    
    private int id_Pers_hys;
    
    
    
//Constructores
    public dtoHys() {
    }

    public dtoHys(String tipo, String nombre, int porcentaje, int id_Pers_hys) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.id_Pers_hys = id_Pers_hys;
    }
       
// Getters and Setters
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getId_Pers_hys() {
        return id_Pers_hys;
    }

    public void setId_Pers_hys(int id_Pers_hys) {
        this.id_Pers_hys = id_Pers_hys;
    }
    
    
    
    
}
