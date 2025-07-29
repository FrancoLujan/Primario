package com.example.primario.services.implementaciones;

import com.example.primario.entities.Grado;
import com.example.primario.gestores.GestorRepo;
import com.example.primario.services.interfaces.GradoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradoServicioImp extends ServicioImpl<Grado, Integer> implements GradoServicio<Grado, Integer> {

    private final GestorRepo gestorRepo;


    @Override
    public void update(Grado entidad) {
        gestorRepo.getGradoRepository().save(entidad);
    }

    @Override
    public void add(Grado entidad) {
        gestorRepo.getGradoRepository().save(entidad);

    }

    @Override
    public void delete(Integer id) {
        gestorRepo.getGradoRepository().deleteById(id);

    }

    @Override
    public Grado findById(Integer entidadId) {
        return gestorRepo.getGradoRepository().findById(entidadId).orElse(null);
    }

    @Override
    public List<Grado> findAll(Integer id) {
        return gestorRepo.getGradoRepository().findAll();
    }
}
