package org.mediotransporte.Aplication;

import org.mediotransporte.Domain.MedioTransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="")
public class MediosTransporteController {
    @Autowired
    private MedioTransporteService medioTransporteService;

    @GetMapping
    public ResponseEntity<List<MediosTransporte>> obtenerTodosLosMediosDeTransporte() {
        List<MediosTransporte> mediosTransporteList = medioTransporteService.obtenerTodosLosMediosDeTransporte();
        return new ResponseEntity<>(mediosTransporteList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MediosTransporte> obtenerMedioDeTransportePorId(@PathVariable Long id) {
        Optional<MediosTransporte> mediosTransporte = medioTransporteService.obtenerMedioDeTransportePorId(id);
        return mediosTransporte.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<MediosTransporte> guardarMedioDeTransporte(@RequestBody MediosTransporte mediosTransporte) {
        MediosTransporte savedMediosTransporte = medioTransporteService.guardarMedioDeTransporte(mediosTransporte);
        return new ResponseEntity<>(savedMediosTransporte, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MediosTransporte> actualizarMedioDeTransporte(@PathVariable Long id, @RequestBody MediosTransporte mediosTransporte) {
        MediosTransporte updatedMediosTransporte = medioTransporteService.actualizarMedioDeTransporte(id, mediosTransporte);
        return new ResponseEntity<>(updatedMediosTransporte, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMedioDeTransportePorId (@PathVariable Long id){
        medioTransporteService.eliminarMedioDeTransportePorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}