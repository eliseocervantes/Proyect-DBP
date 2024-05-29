package org.Alerta.Domain;

import jakarta.persistence.*;
import lombok.Data;
import org.Ruta.Domain.Ruta;
import org.Usuario.Domain.Usuario;

@Data
@Entity
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlerta;
    private String colorDeAlerta;
    private String descripcion;

    @OneToOne
    private Ruta ruta;


    // Constructor por defecto
    public Alerta() {}

    // Constructor con valores iniciales
    public Alerta(String colorDeAlerta, String descripcion) {
        this.colorDeAlerta = colorDeAlerta;
        this.descripcion = descripcion;
    }

    // Getters y Setters

    public Long getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Long idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getColorDeAlerta() {
        return colorDeAlerta;
    }

    public void setColorDeAlerta(String colorDeAlerta) {
        this.colorDeAlerta = colorDeAlerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}