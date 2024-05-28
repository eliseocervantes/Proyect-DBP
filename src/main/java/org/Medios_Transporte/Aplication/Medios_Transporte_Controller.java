package org.Medios_Transporte.Aplication;

import org.Medios_Transporte.Domain.Medios_Transporte;
import com.Medios_Transporte.Domain.Medios_Transporte_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="")
public class Medios_Transporte_Controller {
    @Autowired
    private Medios_Transporte_Service mediosTransporteService;

    @GetMapping
    public ResponseEntity<List<Medios_Transporte>> obtenerTodosLosMediosDeTransporte() {
        List<Medios_Transporte> mediosTransporteList = mediosTransporteService.obtenerTodosLosMediosDeTransporte();
        return new ResponseEntity<>(mediosTransporteList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medios_Transporte> obtenerMedioDeTransportePorId(@PathVariable Long id) {
        Optional<Medios_Transporte> medioDeTransporte = mediosTransporteService.obtenerMedioDeTransportePorId(id);
        return medioDeTransporte.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Medios_Transporte> guardarMedioDeTransporte(@RequestBody Medios_Transporte medioDeTransporte) {
        Medios_Transporte savedMedioDeTransporte = mediosTransporteService.guardarMedioDeTransporte(medioDeTransporte);
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
