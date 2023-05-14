package com.portfolio.mecomp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String descripcionEdu;
    private int id_Pers_edu;

//Constructores
    public Educacion() {
    }

    public Educacion(String nombreEdu, String descripcionEdu, int id_Pers_edu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.id_Pers_edu = id_Pers_edu;
    }   
    
 // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public int getId_Pers_edu() {
        return id_Pers_edu;
    }

    public void setId_Pers_edu(int id_Persona) {
        this.id_Pers_edu = id_Pers_edu;
    }
    
    
    
}
