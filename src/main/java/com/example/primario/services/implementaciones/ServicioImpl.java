package com.example.primario.services.implementaciones;

import com.example.primario.services.interfaces.Servicio;
import org.springframework.stereotype.Service;

@Service
public abstract class ServicioImpl<T, K> implements Servicio<T, K> {
}
