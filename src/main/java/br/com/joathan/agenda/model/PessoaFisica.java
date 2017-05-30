package br.com.joathan.agenda.model;

import java.util.Calendar;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("PF")
public class PessoaFisica extends Usuario {

	private static final long serialVersionUID = 1L;
	private String cpf;
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
