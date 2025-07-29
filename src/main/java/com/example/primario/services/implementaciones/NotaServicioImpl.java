package com.example.primario.services.implementaciones;

import com.example.primario.entities.Nota;
import com.example.primario.gestores.GestorRepo;
import com.example.primario.services.interfaces.NotaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotaServicioImpl  extends ServicioImpl<Nota, Integer> {
    private final GestorRepo gestorRepo;
    @Override
    public void update(Nota entidad) {
        gestorRepo.getNotaRepository().save(entidad);

    }

    @Override
    public void add(Nota entidad) {
        gestorRepo.getNotaRepository().save(entidad);
    }

    @Override
    public void delete(Integer id) {
        gestorRepo.getNotaRepository().deleteById(id);

    }

    @Override
    public Nota findById(Integer entidadId) {
        return gestorRepo.getNotaRepository().findById(entidadId).orElse(null);
    }

    @Override
    public List<Nota> findAll(Integer id) {
        return gestorRepo.getNotaRepository().findAll();
    }
}
