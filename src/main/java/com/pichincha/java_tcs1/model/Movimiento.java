package com.pichincha.java_tcs1.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float valor;
    private String descripcionMovimiento;
    @ManyToOne
    private Cuenta cuenta;

}
