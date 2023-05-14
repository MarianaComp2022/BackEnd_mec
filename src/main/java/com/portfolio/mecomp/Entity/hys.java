package com.portfolio.mecomp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class hys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo;
    private String nombre;
    private int porcentaje;
    private int id_Pers_hys;
    
//Constructores
  
    public hys() {
    }

    public hys(String tipo, String nombre, int porcentaje, int id_Pers_hys) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.id_Pers_hys = id_Pers_hys;
    }

    
// Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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



