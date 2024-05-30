package org.Medio_Transporte.Infrastructure;

import org.Medio_Transporte.Domain.MediosTransporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedioTransporteRepository extends JpaRepository<MediosTransporte,Long> {
}
