
package com.mycompany.carwash.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    @Basic
    private String nombre_Duenio;
    private String telDuenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre_Duenio, String telDuenio) {
        this.id_duenio = id_duenio;
        this.nombre_Duenio = nombre_Duenio;
        this.telDuenio = telDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre_Duenio() {
        return nombre_Duenio;
    }

    public void setNombre_Duenio(String nombre_Duenio) {
        this.nombre_Duenio = nombre_Duenio;
    }

    public String getTelDuenio() {
        return telDuenio;
    }

    public void setTelDuenio(String telDuenio) {
        this.telDuenio = telDuenio;
    }
    
    
}
