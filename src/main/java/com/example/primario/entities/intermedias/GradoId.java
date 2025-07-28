package com.example.primario.entities.intermedias;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class GradoId implements Serializable {
    private int grado;
    private int profesorId;
}
