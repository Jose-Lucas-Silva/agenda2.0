package br.com.joathan.agenda.interf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.PessoaFisica;

@RepositoryRestResource(collectionResourceRel = "pf", path = "pf")
public interface PessoaJuridicaRepository extends PagingAndSortingRepository<PessoaFisica, Long> {

	List<PessoaFisica> findByNome(@Param("nome") String nome);
}
