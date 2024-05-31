package org.user.domain;

import org.user.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository usuarioRepository;

    public List<User> findAll() {
        return usuarioRepository.findAll();
    }

    public User save(User usuario) {
        return usuarioRepository.save(usuario);
    }

    public User findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}

