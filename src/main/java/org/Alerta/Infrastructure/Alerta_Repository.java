package org.Alerta.Infrastructure;

import org.Alerta.Domain.AlertaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Alerta_Repository extends JpaRepository<AlertaService,Long> {
}
