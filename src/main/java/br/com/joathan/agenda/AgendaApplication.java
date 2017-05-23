package br.com.joathan.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.joathan.agenda.model.PessoaFisica;
import br.com.joathan.agenda.model.Usuario;

@SpringBootApplication
public class AgendaApplication {

	public static void main(String[] args) {	
		SpringApplication.run(AgendaApplication.class, args);
	}
}
