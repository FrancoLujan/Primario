package com.example.primario.services.interfaces;

import java.util.List;

public interface Servicio<T, K> {
    void update(T entidad);

    void add(T entidad);

    void delete(K id);

    T findById(K entidadId);

    List<T> findAll(K id);
}
