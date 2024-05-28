package org.Medios_Transporte.Domain;

import org.Medios_Transporte.Infrastructure.Medios_Transporte_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Medios_Transporte_Service {

    private final Medios_Transporte_Repository mediosTransporteRepository;

    @Autowired
    public Medios_Transporte_Service(Medios_Transporte_Repository mediosTransporteRepository) {
        this.mediosTransporteRepository = mediosTransporteRepository;
    }

    public List<Medios_Transporte> obtenerTodosLosMediosDeTransporte() {
        return mediosTransporteRepository.findAll();
    }

    public Optional<Medios_Transporte> obtenerMedioDeTransportePorId(Long id) {
        return mediosTransporteRepository.findById(id);
    }

    public Medios_Transporte guardarMedioDeTransporte(Medios_Transporte medioDeTransporte) {
        return mediosTransporteRepository.save(medioDeTransporte);
    }

    public Medios_Transporte actualizarMedioDeTransporte(Long id, Medios_Transporte medioDeTransporte) {
        medioDeTransporte.setIdTransporte(id);
        return mediosTransporteRepository.save(medioDeTransporte);
    }

    public void eliminarMedioDeTransportePorId(Long id) {
        mediosTransporteRepository.deleteById(id);
    }
}