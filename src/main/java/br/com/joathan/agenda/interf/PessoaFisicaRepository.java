package br.com.joathan.agenda.interf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joathan.agenda.model.PessoaJuridica;

@RepositoryRestResource(collectionResourceRel = "pj", path = "pj")
public interface PessoaFisicaRepository extends PagingAndSortingRepository<PessoaJuridica, Long> {

	List<PessoaJuridica> findByNome(@Param("nome") String nome);
}
