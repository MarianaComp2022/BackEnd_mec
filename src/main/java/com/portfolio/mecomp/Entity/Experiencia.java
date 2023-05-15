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
    private int idPersexp;
    // Constructores
    
    public Experiencia(){
    }

    public Experiencia(String nombreExp, String descripcionExp, int idPersexp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.idPersexp = idPersexp;
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

    public int getIdPersexp() {
        return idPersexp;
    }

    public void setIdPersexp(int idPersexp) {
        this.idPersexp = idPersexp;
    }

    
    
    
}
