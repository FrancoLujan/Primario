package com.example.primario.entities;


import com.example.primario.entities.intermedias.GradoId;
import com.example.primario.enums.Turno;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Grado")
public class Grado {

    @EmbeddedId
    private GradoId grado;


    @MapsId("profesorId")
    @ManyToOne
    @JoinColumn(name = "profesor")
    private Personal profesor;

    @Column(name = "turno")
    @Enumerated(EnumType.STRING)
    private Turno turno;


    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "grado")
    private List<Alumno> alumnos;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "grado")
    private List<Materia> materias;

}
