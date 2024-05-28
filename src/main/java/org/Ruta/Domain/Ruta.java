package org.Ruta.Domain;


import jakarta.persistence.*;
import lombok.Data;
import org.Usuario.Domain.Usuario;

@Data
@Entity
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRuta;
    private Double distancia;
    private Double tiempo;
    private String ubicacionInicial;
    private String ubicacionFinal;
    private Long idTransporte;
    private Long idAlerta;

    @ManyToOne
    private Usuario usuario;
    // Constructor por defecto
    public Ruta() {}

    // Constructor con valores iniciales
    public Ruta(Double distancia, Double tiempo, String ubicacionInicial, String ubicacionFinal, Long idTransporte, Long idAlerta) {
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.ubicacionInicial = ubicacionInicial;
        this.ubicacionFinal = ubicacionFinal;
        this.idTransporte = idTransporte;
        this.idAlerta = idAlerta;
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

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
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

    public Long getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Long idTransporte) {
        this.idTransporte = idTransporte;
    }

    public Long getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Long idAlerta) {
        this.idAlerta = idAlerta;
    }
}