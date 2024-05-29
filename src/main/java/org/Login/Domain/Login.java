package org.Login.Domain;

import jakarta.persistence.*;
import lombok.Data;
import org.Usuario.Domain.Usuario;

@Data
@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLogin;
    private String contraseña;
    private String emailLogin;
    @ManyToOne
    private Usuario usuario;

    // Constructor por defecto
    public Login() {}

    // Constructor con valores iniciales
    public Login(String contraseña, String emailLogin) {
        this.contraseña = contraseña;
        this.emailLogin = emailLogin;
    }

    // Getters y Setters

    public Long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}