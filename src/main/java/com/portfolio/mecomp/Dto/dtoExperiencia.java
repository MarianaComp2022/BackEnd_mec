package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcionExp;
    private int id_Pers_exp;
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String descripcionExp, int id_Pers_exp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.id_Pers_exp = id_Pers_exp;
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

    public int getId_Pers_exp() {
        return id_Pers_exp;
    }

    public void setId_Pers_exp(int id_Pers_exp) {
        this.id_Pers_exp = id_Pers_exp;
    }
    
    
    
}
