package com.example.primario.services.implementaciones;

import com.example.primario.entities.Alumno;
import com.example.primario.gestores.GestorRepo;
import com.example.primario.repositories.AlumnoRepository;
import com.example.primario.services.interfaces.AlumnoServicio;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlumnoServicioImpl extends ServicioImpl<Alumno, Integer> implements AlumnoServicio<Alumno, Integer> {

    private final GestorRepo gestorRepo;

    @Override
    public void update(Alumno entidad) {
        gestorRepo.getAlumnoRepository().save(entidad);
    }

    @Override
    public void add(Alumno entidad) {
        gestorRepo.getAlumnoRepository().save(entidad);
    }

    @Override
    public void delete(Integer id) {
        gestorRepo.getAlumnoRepository().deleteById(id);

    }

    @Override
    public Alumno findById(Integer entidadId) {
        return gestorRepo.getAlumnoRepository().findById(entidadId).orElse(null);
    }

    @Override
    public List<Alumno> findAll(Integer id) {
        return gestorRepo.getAlumnoRepository().findAll();
    }
}
