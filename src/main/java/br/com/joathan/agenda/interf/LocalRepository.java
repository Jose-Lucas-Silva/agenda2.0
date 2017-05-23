package br.com.joathan.agenda.interf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.Local;

@RepositoryRestResource(collectionResourceRel = "local", path = "local")
public interface LocalRepository extends PagingAndSortingRepository<Local, Long> {

	List<Local> findByNome(@Param("nome") String nome);
}
