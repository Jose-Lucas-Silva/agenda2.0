package br.com.joathan.agenda.model;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Usuario {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long matricula;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
