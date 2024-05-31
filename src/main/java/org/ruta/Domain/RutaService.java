package org.ruta.Domain;

import org.ruta.Infrastructure.RutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RutaService {

    private final RutaRepository rutaRepository;

    @Autowired
    public RutaService(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    public List<Ruta> obtenerTodasLasRutas() {
        return rutaRepository.findAll();
    }

    public Optional<Ruta> obtenerRutaPorId(Long id) {
        return rutaRepository.findById(id);
    }

    public Ruta guardarRuta(Ruta ruta) {
        return rutaRepository.save(ruta);
    }

    public Ruta actualizarRuta(Long id, Ruta ruta) {
        ruta.setIdRuta(id);
        return rutaRepository.save(ruta);
    }

    public void eliminarRutaPorId(Long id) {
        rutaRepository.deleteById(id);
    }
}