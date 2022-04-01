package com.pichincha.java_tcs1.controller;

import com.pichincha.java_tcs1.model.Cuenta;
import com.pichincha.java_tcs1.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/v1/cuenta")
public class cuentaController {
    @Autowired
    private CuentaService cuentaService;

    @GetMapping()
    public List<Cuenta> getCuentas() {
        return cuentaService.getCuentas();
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Cuenta cuenta) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cuentaService.save(cuenta));

    }
    @DeleteMapping("/{cuentaid}")
    private void deleteCountry(@PathVariable("cuentaid") int id)
    {
        cuentaService.delete(id);
    }

    @PutMapping()
    private Cuenta update(@RequestBody Cuenta cuenta)
    {
        cuentaService.save(cuenta);
        return cuenta;
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Cuenta cuenta, @PathVariable(value = "id") Integer cuentaId) {

        Optional<Cuenta> optUser = cuentaService.FindById(cuentaId);
        if (!optUser.isPresent()) {
            return ResponseEntity.notFound().build();

        }
        optUser.get().setNombre(cuenta.getNombre());
        optUser.get().setTipo(cuenta.getTipo());

        return ResponseEntity.status(HttpStatus.CREATED).body(cuentaService.Save(optUser.get()));

    }



}
