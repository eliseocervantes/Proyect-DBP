package org.actividadFisica.Infrastructure;

import org.actividadFisica.Domain.ActividadFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadFisicaRepository extends JpaRepository<ActividadFisica, Long> {
}