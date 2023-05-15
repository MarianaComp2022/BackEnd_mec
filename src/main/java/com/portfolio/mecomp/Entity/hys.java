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
    private int idPershys;
    
//Constructores
  
    public hys() {
    }

    public hys(String tipo, String nombre, int porcentaje, int idPershys) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.idPershys = idPershys;
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

    public int getIdPershys() {
        return idPershys;
    }

    public void setIdPershys(int idPershys) {
        this.idPershys = idPershys;
    }

    
    

    
    
}



