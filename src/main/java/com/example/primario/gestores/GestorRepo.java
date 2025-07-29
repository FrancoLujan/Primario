package com.example.primario.gestores;

import com.example.primario.repositories.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor // usar en Componentes excepto entidedes
// Hace la inyeccion de dependencia sin usar Autowired explicitamente
@Getter
public class GestorRepo {

    private final AlumnoRepository alumnoRepository;
    private final CargoRepository cargoRepository;
    private final GradoRepository gradoRepository;
    private final MateriaRepository materiaRepository;
    private final NotaRepository notaRepository;
    private final PersonalRepository personalRepository;


}
