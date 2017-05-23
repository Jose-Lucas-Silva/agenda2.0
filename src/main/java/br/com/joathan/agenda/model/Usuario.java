package br.com.joathan.agenda.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
// cria a tabela com os dois campos. usar classe normal
// @Inheritance

// cria tabelas fazendo join na principal. usar classe abstrata
@Inheritance(strategy = InheritanceType.JOINED)

// cria tabelas contendo mesmos campos da principal. usar classe abstrata
// @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

// usar essa anotação sem a anotação @Entity
// aparentemente tem o mesmo funcionamento da ultima anotação
// @MappedSuperclass
public abstract class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
