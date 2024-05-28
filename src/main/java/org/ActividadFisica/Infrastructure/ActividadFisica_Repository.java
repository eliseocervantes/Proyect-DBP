package org.ActividadFisica.Infrastructure;

import org.ActividadFisica.Domain.ActividadFisicaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadFisica_Repository extends JpaRepository<ActividadFisicaService,Long> {
}
