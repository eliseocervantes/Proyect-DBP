package org.Login.Domain;

import org.Login.Infrastructure.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public List<Login> obtenerTodosLosLogins() {
        return loginRepository.findAll();
    }

    public Optional<Login> obtenerLoginPorId(Long id) {
        return loginRepository.findById(id);
    }

    public Login guardarLogin(Login login) {
        return loginRepository.save(login);
    }

    public Login actualizarLogin(Long id, Login login) {
        login.setIdLogin(id);
        return loginRepository.save(login);
    }

    public void eliminarLoginPorId(Long id) {
        loginRepository.deleteById(id);
    }
}