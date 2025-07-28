package com.example.primario.entities.intermedias;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Embeddable
public class NotaId implements Serializable {

    public int legajoAlumno;
    public int materia;
}
