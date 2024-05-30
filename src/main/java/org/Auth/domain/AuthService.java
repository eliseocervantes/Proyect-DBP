package org.Auth.domain;

import org.Auth.dto.JwtAuthResponse;
import org.Auth.dto.LoginReq;
import org.Auth.dto.RegisterReq;
import org.Auth.exceptions.UserAlreadyExistException;
import org.Usuario.Domain.Usuario;
import org.Usuario.Infrastructure.UsuarioRepository;
import org.config.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final LoginRepository loginRepository;
    private final JwtService jwtService;

    public AuthService(UsuarioRepository usuarioRepository, LoginRepository loginRepository, JwtService jwtService) {
        this.usuarioRepository = usuarioRepository;
        this.loginRepository = loginRepository;
        this.jwtService = jwtService;
    }

    public JwtAuthResponse login(LoginReq req) {
        Login login = loginRepository.findByEmail(req.getEmail())
                .orElseThrow(() -> new UserAlreadyExistException("Email is not registered"));

        if (!req.getPassword().equals(login.getPassword()))
            throw new IllegalArgumentException("Password is incorrect");

        Usuario usuario = usuarioRepository.findById(login.getIdUsuario())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        JwtAuthResponse response = new JwtAuthResponse();
        response.setToken(jwtService.generateToken(usuario));
        return response;
    }

    public JwtAuthResponse register(RegisterReq req){
        if (loginRepository.existsByEmail(req.getEmail()))
            throw new UserAlreadyExistException("Email is already registered");

        Usuario usuario = new Usuario();
        usuario.setNombre(req.getFirstName());
        usuario.setApellido(req.getLastName());
        usuarioRepository.save(usuario);

        Login login = new Login();
        login.setEmail(req.getEmail());
        login.setPassword(req.getPassword());
        login.setIdUsuario(usuario.getIdUsuario());
        loginRepository.save(login);

        JwtAuthResponse response = new JwtAuthResponse();
        response.setToken(jwtService.generateToken(usuario));
        return response;
      Apellido(req.getLastName());

    }
}