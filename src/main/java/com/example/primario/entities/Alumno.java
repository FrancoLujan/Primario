package com.example.primario.entities;

import com.example.primario.entities.intermedias.GradoId;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Alumnos")
public class Alumno {

    @Id
    @Column(name = "legajo")
    private int legajo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    //foraneas
    /*
    MapsId: usa los atributos de la tabla intermedia GradoId
     */

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "grado", referencedColumnName = "grado"),
            @JoinColumn(name = "profesor", referencedColumnName = "profesor")
    }
    )
    private Grado grado;

}
