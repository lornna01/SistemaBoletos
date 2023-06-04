package com.proyecto.SistemaBoletos.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_rol;


     //CONSTRUCTOR
    public Rol() {
        }

    public Rol(int id, String nombre_rol) {
        this.id = id;
        this.nombre_rol = nombre_rol;
    }

    public int getId() {
        return id;
    }       

    public void setId_rol(int id) {
        this.id = id;
    }
    
    public String getNombre_rol() {
        return nombre_rol;
    }
    
    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    
}