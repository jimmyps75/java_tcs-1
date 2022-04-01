package com.pichincha.java_tcs1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String tipo;
    @JsonManagedReference
    @OneToMany(mappedBy = "cuenta")
    private List<Movimiento> movimientos;

}
