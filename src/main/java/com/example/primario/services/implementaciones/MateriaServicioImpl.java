package com.example.primario.services.implementaciones;

import com.example.primario.entities.Materia;
import com.example.primario.gestores.GestorRepo;
import com.example.primario.repositories.MateriaRepository;
import com.example.primario.services.interfaces.MateriaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MateriaServicioImpl extends ServicioImpl<Materia, Integer> implements MateriaServicio<Materia, Integer> {

    private final GestorRepo gestorRepo;


    @Override
    public void update(Materia entidad) {
        gestorRepo.getMateriaRepository().save(entidad);
    }

    @Override
    public void add(Materia entidad) {
        gestorRepo.getMateriaRepository().save(entidad);

    }

    @Override
    public void delete(Integer id) {
        gestorRepo.getMateriaRepository().deleteById(id);

    }

    @Override
    public Materia findById(Integer entidadId) {
        return gestorRepo.getMateriaRepository().findById(entidadId).orElse(null);
    }

    @Override
    public List<Materia> findAll(Integer id) {
        return gestorRepo.getMateriaRepository().findAll();
    }
}
