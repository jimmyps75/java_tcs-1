package com.pichincha.java_tcs1.service;

import com.pichincha.java_tcs1.model.Cuenta;
import com.pichincha.java_tcs1.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;
    public List<Cuenta> getCuentas() {return cuentaRepository.findAll();}
    public Cuenta save(Cuenta cuenta){
        return cuentaRepository.save(cuenta);
    }

    public void delete(int id)
    {
        cuentaRepository.deleteById(id);
    }

    //updating a record
    public Cuenta Save(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }


    public Optional<Cuenta> FindById(Integer Id) {
        return cuentaRepository.findById(Id);
    }


    public Iterable<Cuenta> FindAll() {
        return cuentaRepository.findAll();
    }
}
