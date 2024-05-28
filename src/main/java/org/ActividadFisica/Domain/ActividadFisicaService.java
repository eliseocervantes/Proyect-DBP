package org.ActividadFisica.Domain;

import org.ActividadFisica.Infrastructure.ActividadFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadFisicaService {

    private final ActividadFisicaRepository actividadFisicaRepository;

    @Autowired
    public ActividadFisicaService(ActividadFisicaRepository actividadFisicaRepository) {
        this.actividadFisicaRepository = actividadFisicaRepository;
    }

    public List<ActividadFisica> obtenerTodasLasActividadesFisicas() {
        return actividadFisicaRepository.findAll();
    }

    public Optional<ActividadFisica> obtenerActividadFisicaPorId(Long id) {
        return actividadFisicaRepository.findById(id);
    }

    public ActividadFisica guardarActividadFisica(ActividadFisica actividadFisica) {
        return actividadFisicaRepository.save(actividadFisica);
    }

    public ActividadFisica actualizarActividadFisica(Long id, ActividadFisica actividadFisica) {
        actividadFisica.setIdActividad(id);
        return actividadFisicaRepository.save(actividadFisica);
    }

    public void eliminarActividadFisicaPorId(Long id) {
        actividadFisicaRepository.deleteById(id);
    }
}