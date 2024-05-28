package org.ActividadFisica.Domain;

import org.Usuario.Domain.Usuario;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ActividadFisicaService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransporte;
    private String nombre;
    private String marca;
    @ManyToOne
    private Usuario usuario;

    // Constructor por defecto
    public ActividadFisicaService() {}

    // Constructor con valores iniciales
    public ActividadFisicaService(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    // Getters y Setters

    public Long getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Long idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}