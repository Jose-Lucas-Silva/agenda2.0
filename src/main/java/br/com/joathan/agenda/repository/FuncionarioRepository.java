package br.com.joathan.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.joathan.agenda.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

}
