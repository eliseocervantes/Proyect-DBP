package org.vehicle.infrastructure;

import org.vehicle.domain.MediosTransporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedioTransporteRepository extends JpaRepository<MediosTransporte,Long> {
}
