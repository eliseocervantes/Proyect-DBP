package org.Historial.Aplication;

import org.Historial.Domain.HistorialService;
import org.Medios_Transporte.Domain.Medios_Transporte_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="")
public class HistorialController {
    @Autowired
    private Medios_Transporte_Service mediosTransporteService;

    @GetMapping
    public ResponseEntity<List<HistorialService>> obtenerTodosLosMediosDeTransporte() {
        List<HistorialService> mediosTransporteList = mediosTransporteService.obtenerTodosLosMediosDeTransporte();
        return new ResponseEntity<>(mediosTransporteList, HttpStatus.OK);
    }

    @GetMapping("/{id}") //corregir
    public ResponseEntity<HistorialService> obtenerMedioDeTransportePorId(@PathVariable Long id) {
        Optional<HistorialService> medioDeTransporte = mediosTransporteService.obtenerMedioDeTransportePorId(id);
        return medioDeTransporte.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<HistorialService> guardarMedioDeTransporte(@RequestBody HistorialService medioDeTransporte) {
        HistorialService savedMedioDeTransporte = mediosTransporteService.guardarMedioDeTransporte(medioDeTransporte);
        return new ResponseEntity<>(savedMedioDeTransporte, HttpStatus.CREATED);
    }
    //
    @PutMapping("/{id}")
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
