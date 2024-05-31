package org.actividadFisica.aplication;

import org.actividadFisica.domain.ActividadFisica;
import org.actividadFisica.domain.ActividadFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="")
public class ActividadFisicaController {
    @Autowired
    private ActividadFisicaService actividadFisicaService;

    @GetMapping
    public ResponseEntity<List<ActividadFisica>> obtenerTodasLasActividadesFisicas() {
        List<ActividadFisica> actividadFisicaList = actividadFisicaService.obtenerTodasLasActividadesFisicas();
        return new ResponseEntity<>(actividadFisicaList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActividadFisica> obtenerActividadFisicaPorId(@PathVariable Long id) {
        Optional<ActividadFisica> actividadFisica = actividadFisicaService.obtenerActividadFisicaPorId(id);
        return actividadFisica.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<ActividadFisica> guardarActividadFisica(@RequestBody ActividadFisica actividadFisica) {
        ActividadFisica savedActividadFisica = actividadFisicaService.guardarActividadFisica(actividadFisica);
        return new ResponseEntity<>(savedActividadFisica, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ActividadFisica> actualizarActividadFisica(@PathVariable Long id, @RequestBody ActividadFisica actividadFisica) {
        ActividadFisica updatedActividadFisica = actividadFisicaService.actualizarActividadFisica(id, actividadFisica);
        return new ResponseEntity<>(updatedActividadFisica, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarActividadFisicaPorId (@PathVariable Long id){
        actividadFisicaService.eliminarActividadFisicaPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}