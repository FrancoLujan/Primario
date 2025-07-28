package com.example.primario.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Cargo")
public class Cargo {
    @Column(name = "id_cargo")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion")
    private String descripcion;



}
