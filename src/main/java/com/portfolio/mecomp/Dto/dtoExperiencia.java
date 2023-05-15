package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcionExp;
    private int idPersexp;
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String descripcionExp, int idPersexp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.idPersexp = idPersexp;
    }
       
    //Getters & Setters

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public int getIdPersexp() {
        return idPersexp;
    }

    public void setIdPersexp(int idPersexp) {
        this.idPersexp = idPersexp;
    }

    
    
    
    
}
