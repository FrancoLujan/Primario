package com.example.primario.entities;

import com.example.primario.entities.intermedias.NotaId;
import com.example.primario.enums.EstadoMateria;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Notas")
public class Nota {

    // clave compuestaaa
    @EmbeddedId
    private NotaId id;

    @MapsId("legajoAlumno")
    @ManyToOne
    @JoinColumn(name = "legajo_alumno", referencedColumnName = "legajo")
    private Alumno alumno;

    @MapsId("materia")
    @ManyToOne
    @JoinColumn(name = "materia", referencedColumnName = "id_materia")
    private Materia materia;

    @Column(name = "nota")
    private int nota;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private EstadoMateria estado;


}
