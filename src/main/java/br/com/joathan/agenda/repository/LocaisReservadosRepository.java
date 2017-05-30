package br.com.joathan.agenda.interf;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.LocaisReservados;

@RepositoryRestResource(collectionResourceRel = "locaisreservados", path = "locaisreservados")
public interface LocaisReservadosRepository extends CrudRepository<LocaisReservados, Long> {

	//@Query("select lr from locais_reservados lr, local l, reserva r where lr.reserva_id = r.id and rl.local_id = l.id")
	//List<LocaisReservados> findByAndSort(Integer reserva_id, Sort sort);
}
