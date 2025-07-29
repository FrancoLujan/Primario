package com.example.primario.services.implementaciones;

import com.example.primario.entities.Cargo;
import com.example.primario.gestores.GestorRepo;
import com.example.primario.repositories.CargoRepository;
import com.example.primario.services.interfaces.CargoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CargoServicioImpl extends ServicioImpl<Cargo, Integer> implements CargoServicio<Cargo, Integer> {
    private final GestorRepo gestorRepo;


    @Override
    public void update(Cargo entidad) {
        gestorRepo.getCargoRepository().save(entidad);

    }

    @Override
    public void add(Cargo entidad) {
        gestorRepo.getCargoRepository().save(entidad);
    }

    @Override
    public void delete(Integer id) {
        gestorRepo.getCargoRepository().deleteById(id);

    }

    @Override
    public Cargo findById(Integer entidadId) {
        return gestorRepo.getCargoRepository().findById(entidadId).orElse(null);
    }

    @Override
    public List<Cargo> findAll(Integer id) {
        return gestorRepo.getCargoRepository().findAll();
    }
}
