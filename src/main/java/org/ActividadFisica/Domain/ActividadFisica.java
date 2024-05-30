package org.ActividadFisica.Domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ActividadFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActividad;
    private Double peso;
    private Double altura;
    private Double distanciaTotal;
    private Double caloriasQuemadas;

    public ActividadFisica() {}

    public ActividadFisica(Double peso, Double altura, Double distanciaTotal, Double caloriasQuemadas) {
        this.peso = peso;
        this.altura = altura;
        this.distanciaTotal = distanciaTotal;
        this.caloriasQuemadas = caloriasQuemadas;
    }


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

    public Double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(Double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public Double getCaloriasQuemadas() {
        return caloriasQuemadas;
    }

    public void setCaloriasQuemadas(Double caloriasQuemadas) {
        this.caloriasQuemadas = caloriasQuemadas;
    }
}