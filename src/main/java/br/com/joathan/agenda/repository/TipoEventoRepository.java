package br.com.joathan.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.joathan.agenda.model.TipoEvento;

public interface TipoEventoRepository extends CrudRepository<TipoEvento, Long> {

}
