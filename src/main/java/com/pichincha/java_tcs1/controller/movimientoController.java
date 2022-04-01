package com.pichincha.java_tcs1.controller;

import com.pichincha.java_tcs1.model.Movimiento;
import com.pichincha.java_tcs1.service.CuentaService;
import com.pichincha.java_tcs1.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movimiento")
public class movimientoController {
    @Autowired
    private MovimientoService movimientoService;

    @DeleteMapping("/{movimientoid}")
    private void deleteMovimiento(@PathVariable("movimientoid") int id)
    {
        movimientoService.delete(id);
    }

    @GetMapping("/{movimientoid}")
    public ResponseEntity<?> read(@PathVariable(value = "movimientoid") Integer movimientoid) {
        Optional<Movimiento> optUser = movimientoService.FindById(movimientoid);
        if (!optUser.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optUser);
    }

}
