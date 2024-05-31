package org.actividadFisica.infrastructure;

import org.actividadFisica.domain.ActividadFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadFisicaRepository extends JpaRepository<ActividadFisica, Long> {
}