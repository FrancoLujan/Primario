package com.example.primario.entities;

import com.example.primario.entities.intermedias.GradoId;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private int id;


    @Column(name = "nombre")
    private String nombre;

    // relacion foranea es asi
    @ManyToOne
    @JoinColumns({ // NAME A COLUMNA DE TABLA ACTUAL Y REFERENCE A LA GRADO
            @JoinColumn(name = "grado", referencedColumnName = "grado"),
            @JoinColumn(name = "profesor", referencedColumnName = "profesor")
    })
    private Grado grado;


}
