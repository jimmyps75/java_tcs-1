package com.pichincha.java_tcs1.service;

import com.pichincha.java_tcs1.model.Cuenta;
import com.pichincha.java_tcs1.model.Movimiento;
import com.pichincha.java_tcs1.repository.CuentaRepository;
import com.pichincha.java_tcs1.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovimientoService {
    @Autowired
    private MovimientoRepository movimientoRepository;
    public void delete(int id)
    {
        movimientoRepository.deleteById(id);
    }

    public Optional<Movimiento> FindById(Integer Id) {
        return movimientoRepository.findById(Id);
    }

}
