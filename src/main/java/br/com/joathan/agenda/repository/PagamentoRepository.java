package br.com.joathan.agenda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.joathan.agenda.model.Pagamento;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {
	
	List<Pagamento> findByReservaId(Long id);
}
