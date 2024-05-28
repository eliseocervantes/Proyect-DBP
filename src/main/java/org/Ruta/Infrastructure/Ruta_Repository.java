package org.Ruta.Infrastructure;

import org.Ruta.Domain.RutaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ruta_Repository extends JpaRepository<RutaService,Long> {
}
