package br.com.joathan.agenda.interf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.Equipamento;

@RepositoryRestResource(collectionResourceRel = "equipamento", path = "equipamento")
public interface EquipamentoRepository extends PagingAndSortingRepository<Equipamento, Long> {

	List<Equipamento> findByDescricao(@Param("descricao") String descricao);
}
