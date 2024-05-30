package org.User.Domain;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;
    private String lastName;
    private Date birthDate;
    private String sex;
    private String email;
    private String password;
    private int objetivoCalorias;

    public User() {
    }

    public User(String name, String lastName, Date birthDate, String sex, String email, String password, int objetivoCalorias) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.objetivoCalorias = objetivoCalorias;
    }


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}