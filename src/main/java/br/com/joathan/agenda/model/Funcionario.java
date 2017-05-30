package br.com.joathan.agenda.model;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Usuario {

	private static final long serialVersionUID = 1L;
	private long matricula;
	
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public void VerificaDisponibilidade() {

	}

	public void RealizaReserva() {

	}

	public void AgendaEvento() {

	}

	public void CancelaEvento() {

	}

	public void AlteraEvento() {

	}

}
