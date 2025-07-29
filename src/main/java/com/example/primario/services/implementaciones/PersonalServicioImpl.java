package com.example.primario.services.implementaciones;

import com.example.primario.entities.Personal;
import com.example.primario.gestores.GestorRepo;
import com.example.primario.services.interfaces.PersonalServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonalServicioImpl extends ServicioImpl<Personal, Integer> implements PersonalServicio<Personal, Integer> {
    private final GestorRepo gestorRepo;

    @Override
    public void update(Personal entidad) {
        gestorRepo.getPersonalRepository().save(entidad);

    }

    @Override
    public void add(Personal entidad) {
        gestorRepo.getPersonalRepository().save(entidad);

    }

    @Override
    public void delete(Integer id) {
        gestorRepo.getPersonalRepository().deleteById(id);
    }

    @Override
    public Personal findById(Integer entidadId) {
        return gestorRepo.getPersonalRepository().findById(entidadId).orElse(null);
    }

    @Override
    public List<Personal> findAll(Integer id) {
        return gestorRepo.getPersonalRepository().findAll();
    }
}
