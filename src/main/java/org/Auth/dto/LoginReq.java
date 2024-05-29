// src/main/java/org/Auth/dto/LoginReq.java
package org.Auth.dto;

import lombok.Data;

@Data
public class LoginReq {
    private String email;
    private String password;
}