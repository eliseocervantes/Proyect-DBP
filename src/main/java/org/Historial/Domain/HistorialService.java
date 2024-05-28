package org.Historial.Domain;

import lombok.Data;
import org.Usuario.Domain.Usuario;

import javax.persistence.*;

@Data
@Entity
public class HistorialService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransporte;
    private String nombre;
    private String marca;
    @ManyToOne
    private Usuario usuario;

    // Constructor por defecto
    public HistorialService() {}

    // Constructor con valores iniciales
    public HistorialService(String nombre, String marca) {
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