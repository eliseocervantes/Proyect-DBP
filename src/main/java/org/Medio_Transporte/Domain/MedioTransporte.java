package org.Medio_Transporte.Domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MedioTransporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransporte;
    private String name;
    private String nick;

    public MedioTransporte() {}

    public MedioTransporte(String name, String nick) {
        this.name = name;
        this.nick = nick;
    }


    public Long getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Long idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}