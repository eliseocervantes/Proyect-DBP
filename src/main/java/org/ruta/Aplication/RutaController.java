package org.ruta.Aplication;

import org.ruta.Domain.Ruta;
import org.ruta.Domain.RutaService;
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
    private RutaService rutaService;

    @GetMapping
    public ResponseEntity<List<Ruta>> obtenerTodasLasRutas() {
        List<Ruta> rutaList = rutaService.obtenerTodasLasRutas();
        return new ResponseEntity<>(rutaList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ruta> obtenerRutaPorId(@PathVariable Long id) {
        Optional<Ruta> ruta = rutaService.obtenerRutaPorId(id);
        return ruta.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Ruta> guardarRuta(@RequestBody Ruta ruta) {
        Ruta savedRuta = rutaService.guardarRuta(ruta);
        return new ResponseEntity<>(savedRuta, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ruta> actualizarRuta(@PathVariable Long id, @RequestBody Ruta ruta) {
        Ruta updatedRuta = rutaService.actualizarRuta(id, ruta);
        return new ResponseEntity<>(updatedRuta, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRutaPorId (@PathVariable Long id){
        rutaService.eliminarRutaPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}