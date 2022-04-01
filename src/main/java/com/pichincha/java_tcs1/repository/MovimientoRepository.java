package com.pichincha.java_tcs1.repository;

import com.pichincha.java_tcs1.model.Cuenta;
import com.pichincha.java_tcs1.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Integer >{

}
