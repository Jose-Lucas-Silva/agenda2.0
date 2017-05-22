package br.com.joathan.agenda.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long cnpj;
	private String razao_social;
	private String nome_fantasia;
	
	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
