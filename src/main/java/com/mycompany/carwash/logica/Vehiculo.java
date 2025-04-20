
package com.mycompany.carwash.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_vehiculo;
    @Basic
    private String Marca;
    private String Modelo;
    private String Color;
    private String Tipo;
    private String Observaciones;
    @OneToOne
    private Duenio unDuenio;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, String Marca, String Modelo, String Color, String Tipo, String Observaciones, Duenio unDuenio) {
        this.id_vehiculo = id_vehiculo;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Tipo = Tipo;
        this.Observaciones = Observaciones;
        this.unDuenio = unDuenio;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
    
    
}
