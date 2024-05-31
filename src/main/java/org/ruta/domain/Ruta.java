package org.ruta.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRuta;
    private Double distancia;
    private String ubicacionInicial;
    private String ubicacionFinal;

    public Ruta() {}

    public Ruta(Double distancia, String ubicacionInicial, String ubicacionFinal) {
        this.distancia = distancia;
        this.ubicacionInicial = ubicacionInicial;
        this.ubicacionFinal = ubicacionFinal;
    }


    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public String getUbicacionInicial() {
        return ubicacionInicial;
    }

    public void setUbicacionInicial(String ubicacionInicial) {
        this.ubicacionInicial = ubicacionInicial;
    }

    public String getUbicacionFinal() {
        return ubicacionFinal;
    }

    public void setUbicacionFinal(String ubicacionFinal) {
        this.ubicacionFinal = ubicacionFinal;
    }
}