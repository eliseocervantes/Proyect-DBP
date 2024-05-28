package org.Medios_Transporte.Domain;

import org.Medios_Transporte.Infrastructure.Medios_Transporte_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediosTransporteService {

    private final Medios_Transporte_Repository mediosTransporteRepository;

    @Autowired
    public MediosTransporteService(Medios_Transporte_Repository mediosTransporteRepository) {
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