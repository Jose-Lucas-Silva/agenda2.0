package br.com.joathan.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.joathan.agenda.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {

}
