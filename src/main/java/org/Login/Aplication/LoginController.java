package org.Login.Aplication;

import org.Login.Domain.Login;
import org.Login.Domain.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping
    public ResponseEntity<List<Login>> obtenerTodosLosLogins() {
        List<Login> loginList = loginService.obtenerTodosLosLogins();
        return new ResponseEntity<>(loginList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Login> obtenerLoginPorId(@PathVariable Long id) {
        Optional<Login> login = loginService.obtenerLoginPorId(id);
        return login.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Login> guardarLogin(@RequestBody Login login) {
        Login savedLogin = loginService.guardarLogin(login);
        return new ResponseEntity<>(savedLogin, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Login> actualizarLogin(@PathVariable Long id, @RequestBody Login login) {
        Login updatedLogin = loginService.actualizarLogin(id, login);
        return new ResponseEntity<>(updatedLogin, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLoginPorId (@PathVariable Long id){
        loginService.eliminarLoginPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
