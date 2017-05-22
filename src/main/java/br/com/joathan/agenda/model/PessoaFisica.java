package br.com.joathan.agenda.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PF")
public class PessoaFisica extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long cpf;

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	
}
