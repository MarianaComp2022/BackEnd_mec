
package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    private int idPersedu;
    
    //Constructores
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu, String descripcionEdu, int idPersedu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.idPersedu = idPersedu;
    }

    
    // Getters and Setters

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

    public int getIdPersedu() {
        return idPersedu;
    }

    public void setIdPersedu(int idPersedu) {
        this.idPersedu = idPersedu;
    }
    
}
