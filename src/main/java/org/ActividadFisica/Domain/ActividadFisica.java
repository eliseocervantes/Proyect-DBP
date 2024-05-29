package org.ActividadFisica.Domain;

import jakarta.persistence.*;
import lombok.Data;
import org.Historial.Domain.Historial;
import org.Usuario.Domain.Usuario;

@Data
@Entity
public class ActividadFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActividad;
    private Double peso;
    private Double altura;
    private Integer cantidadDePasos;
    private Double calorias;
    private Long idUsuario;

    @ManyToOne

    private Historial historial;
    // Constructor por defecto
    public ActividadFisica() {}

    // Constructor con valores iniciales
    public ActividadFisica(Double peso, Double altura, Integer cantidadDePasos, Double calorias, Long idUsuario) {
        this.peso = peso;
        this.altura = altura;
        this.cantidadDePasos = cantidadDePasos;
        this.calorias = calorias;
        this.idUsuario = idUsuario;
    }

    // Getters y Setters

    public Long getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getCantidadDePasos() {
        return cantidadDePasos;
    }

    public void setCantidadDePasos(Integer cantidadDePasos) {
        this.cantidadDePasos = cantidadDePasos;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}