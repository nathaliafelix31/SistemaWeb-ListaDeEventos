package com.eventoapp.eventoapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.eventoapp.Models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
    Evento findByCodigo(long codigo);
}
