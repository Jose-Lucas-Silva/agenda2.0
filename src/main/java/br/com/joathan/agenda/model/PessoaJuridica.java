package br.com.joathan.agenda.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Usuario {

	private static final long serialVersionUID = 1L;

	private String cnpj;

	private String nome_fantasia;

	private String razao_social;
	
	public PessoaJuridica(){
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((nome_fantasia == null) ? 0 : nome_fantasia.hashCode());
		result = prime * result + ((razao_social == null) ? 0 : razao_social.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (nome_fantasia == null) {
			if (other.nome_fantasia != null)
				return false;
		} else if (!nome_fantasia.equals(other.nome_fantasia))
			return false;
		if (razao_social == null) {
			if (other.razao_social != null)
				return false;
		} else if (!razao_social.equals(other.razao_social))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", nome_fantasia=" + nome_fantasia + ", razao_social=" + razao_social
				+ "]";
	}
	

}
