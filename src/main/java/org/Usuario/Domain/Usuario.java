package org.Usuario.Domain;

import org.Medios_Transporte.Domain.MediosTransporte;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String sexo;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<MediosTransporte> mediosTransporte;

    // Constructor por defecto
    public Usuario() {}

    // Constructor con valores iniciales
    public Usuario(String nombre, String apellido, String ocupacion, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.sexo = sexo;
    }

    // Getters y Setters

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<MediosTransporte> getMediosTransporte() {
        return mediosTransporte;
    }

    public void setMediosTransporte(List<MediosTransporte> mediosTransporte) {
        this.mediosTransporte = mediosTransporte;
    }
}