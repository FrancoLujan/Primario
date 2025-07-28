package com.example.primario.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "legajo")
    private int legajo;


    @OneToOne
    @JoinColumn(name = "cargo", referencedColumnName = "id_cargo")
    private Cargo cargo;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
}
