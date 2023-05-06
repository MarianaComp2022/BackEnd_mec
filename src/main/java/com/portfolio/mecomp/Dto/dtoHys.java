package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHys {
    @NotBlank
    private String tipo;
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    
    
//Constructores
    public dtoHys() {
    }
    
    public dtoHys(String tipo, String nombre, int porcentaje) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
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

    
    
}
