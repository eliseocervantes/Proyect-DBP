package org.Medios_Transporte.Infrastructure;

import org.Medios_Transporte.Domain.Medios_Transporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Medios_Transporte_Repository extends JpaRepository<Medios_Transporte,Long> {
}
