
package org.Ruta.Domain;



import org.Usuario.Domain.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class RutaService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private Long idTransporte;
    private String nombre;
    private String marca;
    @ManyToOne
    private Usuario usuario;
    // Constructor por defecto
    public RutaService() {}

    // Constructor con valores iniciales
    public RutaService(String nombre, String marca) {
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
