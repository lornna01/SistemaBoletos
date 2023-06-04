package com.proyecto.SistemaBoletos.Modelo;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "boleto")
public class Boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fecha_emision;
    private Date fecha_validacion;
    private Float precio_boleto;
    private Time hora_prechequeo;

    @ManyToOne
    @JoinColumn(name = "fk_id_reserva")
    private Reserva fk_id_reserva;


    //Constructor
    public Boleto() {
    }

    //CONSTRUCTOR
    public Boleto(int id, Date fecha_emision, Date fecha_validacion, Float precio_boleto,
        Time hora_prechequeo, Reserva fk_id_reserva) {
        this.id = id;
        this.fecha_emision = fecha_emision;
        this.fecha_validacion = fecha_validacion;
        this.precio_boleto = precio_boleto;
        this.hora_prechequeo = hora_prechequeo;
        this.fk_id_reserva = fk_id_reserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_validacion() {
        return fecha_validacion;
    }

    public void setFecha_validacion(Date fecha_validacion) {
        this.fecha_validacion = fecha_validacion;
    }

    public Float getPrecio_boleto() {
        return precio_boleto;
    }

    public void setPrecio_boleto(Float precio_boleto) {
        this.precio_boleto = precio_boleto;
    }

    public Time getHora_prechequeo() {
        return hora_prechequeo;
    }

    public void setHora_prechequeo(Time hora_prechequeo) {
        this.hora_prechequeo = hora_prechequeo;
    }

    public Reserva getFk_id_reserva() {
        return fk_id_reserva;
    }

    public void setFk_id_reserva(Reserva fk_id_reserva) {
        this.fk_id_reserva = fk_id_reserva;
    }


    //GETTERS & SETTERS

    

    


}
