package com.eventoapp.eventoapp.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import javax.validation.constraints.NotEmpty;

@Entity
public class Convidado {

    @Id
    @NotEmpty
    private String rg;
    @NotEmpty
    private String nomeConvidado;

    @ManyToOne
    private Evento evento;

    public Evento getEvento() {

        return evento;
    }

    @OneToMany
    public List<Convidado> convidados;

    public void setEvento(Evento evento) {

        this.evento = evento;
    }

    public String getRg() {

        return rg;
    }

    public void setRg(String rg) {

        this.rg = rg;
    }

    public String getNomeConvidado() {

        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {

        this.nomeConvidado = nomeConvidado;
    }
}
