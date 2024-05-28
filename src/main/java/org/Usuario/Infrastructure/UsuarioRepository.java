package org.Usuario.Infrastructure;

import org.Usuario.Domain.Usuario; // Corrección en la importación
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

