package br.com.joathan.agenda.interf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.Evento;

@RepositoryRestResource(collectionResourceRel = "evento", path = "evento")
public interface EventoRepository extends PagingAndSortingRepository<Evento, Long> {

	List<Evento> findByNome(@Param("nome") String nome);
}
