package org.Ruta.Aplication;

import com.Medios_Transporte.Domain.Medios_Transporte_Service;
import org.Ruta.Domain.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="")
public class RutaController {
    @Autowired
    private Medios_Transporte_Service mediosTransporteService;

    @GetMapping
    public ResponseEntity<List<RutaService>> obtenerTodosLosMediosDeTransporte() {
        List<RutaService> mediosTransporteList = mediosTransporteService.obtenerTodosLosMediosDeTransporte();
        return new ResponseEntity<>(mediosTransporteList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RutaService> obtenerMedioDeTransportePorId(@PathVariable Long id) {
        Optional<RutaService> medioDeTransporte = mediosTransporteService.obtenerMedioDeTransportePorId(id);
        return medioDeTransporte.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<RutaService> guardarMedioDeTransporte(@RequestBody RutaService medioDeTransporte) {
        RutaService savedMedioDeTransporte = mediosTransporteService.guardarMedioDeTransporte(medioDeTransporte);
        return new ResponseEntity<>(savedMedioDeTransporte, HttpStatus.CREATED);
    }
    //corrregir
    //@PutMapping("/{id}")
    //public ResponseEntity<Medios_Transporte> actualizarMedioDeTransporte(@PathVariable Long id, @RequestBody Medios_Transporte medioDeTransporte) {
    //    medioDeTransporte.setId(id);
    //    Medios_Transporte updatedMedioDeTransporte = mediosTransporteService.actualizarMedioDeTransporte(medioDeTransporte);
    //    return new ResponseEntity<>(updatedMedioDeTransporte, HttpStatus.OK);
    //}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMedioDeTransportePorId(@PathVariable Long id) {
        mediosTransporteService.eliminarMedioDeTransportePorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
