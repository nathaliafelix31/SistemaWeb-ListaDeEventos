package com.eventoapp.eventoapp.Repository;

import com.eventoapp.eventoapp.Models.Convidado;
import com.eventoapp.eventoapp.Models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository <Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
}
