package org.vehicle.domain;

import org.vehicle.infrastructure.MedioTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedioTransporteService {

    private final MedioTransporteRepository mediosTransporteRepository;

    @Autowired
    public MedioTransporteService(MedioTransporteRepository mediosTransporteRepository) {
        this.mediosTransporteRepository = mediosTransporteRepository;
    }

    public List<MediosTransporte> obtenerTodosLosMediosDeTransporte() {
        return mediosTransporteRepository.findAll();
    }

    public Optional<MediosTransporte> obtenerMedioDeTransportePorId(Long id) {
        return mediosTransporteRepository.findById(id);
    }

    public MediosTransporte guardarMedioDeTransporte(MediosTransporte medioDeTransporte) {
        return mediosTransporteRepository.save(medioDeTransporte);
    }

    public MediosTransporte actualizarMedioDeTransporte(Long id, MediosTransporte medioDeTransporte) {
        medioDeTransporte.setIdTransporte(id);
        return mediosTransporteRepository.save(medioDeTransporte);
    }

    public void eliminarMedioDeTransportePorId(Long id) {
        mediosTransporteRepository.deleteById(id);
    }
}