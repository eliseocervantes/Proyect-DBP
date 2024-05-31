package org.alerta.Domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlerta;
    private String colorAlerta;
    private String descripcion;

    public Alerta() {}

    public Alerta(String colorAlerta, String descripcion) {
        this.colorAlerta = colorAlerta;
        this.descripcion = descripcion;
    }


    public Long getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Long idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getColorAlerta() {
        return colorAlerta;
    }

    public void setColorAlerta(String colorAlerta) {
        this.colorAlerta = colorAlerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}