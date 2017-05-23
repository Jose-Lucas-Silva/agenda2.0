package br.com.joathan.agenda.interf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.Horario;

@RepositoryRestResource(collectionResourceRel = "horario", path = "horario")
public interface HorarioRepository extends PagingAndSortingRepository<Horario, Long> {

	List<Horario> findByTurno(@Param("turno") String turno);
}
