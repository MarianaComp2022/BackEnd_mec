
package com.portfolio.mecomp.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    private int id_Pers_edu;
    
    //Constructores
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu, String descripcionEdu, int id_Pers_edu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.id_Pers_edu = id_Pers_edu;
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

    public int getId_Pers_edu() {
        return id_Pers_edu;
    }

    public void setId_Pers_edu(int id_Pers_edu) {
        this.id_Pers_edu = id_Pers_edu;
    }
    
    
}
