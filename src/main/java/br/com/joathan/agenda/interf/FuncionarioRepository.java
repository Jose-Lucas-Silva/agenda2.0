package br.com.joathan.agenda.interf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.Funcionario;

@RepositoryRestResource(collectionResourceRel = "funcionario", path = "funcionario")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long> {

	List<Funcionario> findByNome(@Param("nome") String nome);
}
