package org.Medios_Transporte.Domain;



import jakarta.persistence.*;
import org.Ruta.Domain.Ruta;
import org.Usuario.Domain.Usuario;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Entity
public class MediosTransporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private Long idTransporte;
    private String nombre;
    private String marca;
    @ManyToOne
    private Usuario usuario;
    @OneToMany(mappedBy = "mediosTransporte", cascade = CascadeType.ALL)
    private List<Ruta> rutas;

    // Constructor por defecto
    public MediosTransporte() {}

    // Constructor con valores iniciales
    public MediosTransporte(String nombre, String marca) {
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

