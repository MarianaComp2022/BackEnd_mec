package com.portfolio.mecomp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreExp;
    private String descripcionExp;
    private int id_Pers_exp;
    // Constructores
    
    public Experiencia(){
    }

    public Experiencia(String nombreExp, String descripcionExp, int id_Pers_exp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.id_Pers_exp = id_Pers_exp;
    }
           
    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
