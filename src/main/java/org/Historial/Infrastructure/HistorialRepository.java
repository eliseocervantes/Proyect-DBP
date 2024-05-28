package org.Historial.Infrastructure;

import org.Historial.Domain.HistorialService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepository extends JpaRepository<HistorialService,Long> {
}
