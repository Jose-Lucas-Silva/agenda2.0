package br.com.joathan.agenda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import br.com.joathan.agenda.model.Evento;
import br.com.joathan.agenda.model.Funcionario;
import br.com.joathan.agenda.model.Local;
import br.com.joathan.agenda.model.Pagamento;
import br.com.joathan.agenda.model.PessoaFisica;
import br.com.joathan.agenda.model.PessoaJuridica;
import br.com.joathan.agenda.model.Reserva;
import br.com.joathan.agenda.model.TipoEvento;
import br.com.joathan.agenda.repository.EventoRepository;
import br.com.joathan.agenda.repository.FuncionarioRepository;
import br.com.joathan.agenda.repository.LocalRepository;
import br.com.joathan.agenda.repository.PagamentoRepository;
import br.com.joathan.agenda.repository.PessoaFisicaRepository;
import br.com.joathan.agenda.repository.PessoaJuridicaRepository;
import br.com.joathan.agenda.repository.ReservaRepository;
import br.com.joathan.agenda.repository.TipoEventoRepository;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {

	@Autowired
	LocalRepository localRepository;
	@Autowired
	TipoEventoRepository tipoEventoRepository;
	@Autowired
	EventoRepository eventoRepository;
	@Autowired
	PagamentoRepository pagamentoRepository;
	@Autowired
	ReservaRepository reservaRepository;
	@Autowired
	PessoaJuridicaRepository pessoaJuridicaRepository;
	@Autowired
	PessoaFisicaRepository pessoaFisicaRepository;
	@Autowired
	FuncionarioRepository funcionarioRepository;
	// Formato como desejo
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	// calendário com data e hora ocidental
	GregorianCalendar calendar = new GregorianCalendar();

	Local local1 = new Local();
	Local local2 = new Local();
	Local local3 = new Local();
	Local local4 = new Local();
	Local local5 = new Local();
	Local local6 = new Local();

	TipoEvento tipoEvento1 = new TipoEvento();
	TipoEvento tipoEvento2 = new TipoEvento();
	TipoEvento tipoEvento3 = new TipoEvento();
	TipoEvento tipoEvento4 = new TipoEvento();

	Funcionario funcionario1 = new Funcionario();
	Funcionario funcionario2 = new Funcionario();

	Reserva reserva1 = new Reserva();
	Reserva reserva2 = new Reserva();

	Evento evento1 = new Evento();
	Evento evento2 = new Evento();
	Evento evento3 = new Evento();
	Evento evento4 = new Evento();

	Pagamento pagamento1 = new Pagamento();
	Pagamento pagamento2 = new Pagamento();

	PessoaJuridica pj1 = new PessoaJuridica();
	PessoaFisica pf1 = new PessoaFisica();

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);

	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		local1.setNome("Sala Pitanga");
		local1.setValor(100.00);
		local1.setCapacidade(100);
		local1.setUnidade("lugares");

		local2.setNome("Sala Mangaba");
		local2.setValor(120.00);
		local2.setCapacidade(150);
		local2.setUnidade("lugares");

		local3.setNome("Sala Uva");
		local3.setValor(150.00);
		local3.setCapacidade(130);
		local3.setUnidade("lugares");

		local4.setNome("Sala Mangaba");
		local4.setValor(230.00);
		local4.setCapacidade(200);
		local4.setUnidade("lugares");

		local5.setNome("Sala Pajuçara");
		local5.setValor(1000.00);
		local5.setCapacidade(500);
		local5.setUnidade("lugares");

		local6.setNome("Sala Ponta Verde");
		local6.setValor(2000.00);
		local6.setCapacidade(2000);
		local6.setUnidade("lugares");

		tipoEvento1.setDescricao("Formatura");
		tipoEvento2.setDescricao("Seminario");
		tipoEvento3.setDescricao("Pauta cultural");
		tipoEvento4.setDescricao("Palestra");

		tipoEventoRepository.save(tipoEvento1);
		tipoEventoRepository.save(tipoEvento2);
		tipoEventoRepository.save(tipoEvento3);
		tipoEventoRepository.save(tipoEvento4);

		pj1.setCnpj("76123456789096");
		pj1.setContato("82 4356-1234");
		pj1.setEmail("empresa1@empresa.com.br");
		pj1.setNome("Jose Gilberto");
		pj1.setNome_fantasia("Fantasia festas");
		pj1.setRazao_social("JOSE GILBERTO - ME");

		pessoaJuridicaRepository.save(pj1);

		pf1.setContato("82 99543-9876");
		pf1.setCpf("98789908766");
		pf1.setEmail("pf@pessoafisica.com.br");
		pf1.setNascimento(new GregorianCalendar(1980, 02, 11));
		pf1.setNome("João Gabriel de Souza");

		pessoaFisicaRepository.save(pf1);

		ArrayList<Local> locais1 = new ArrayList<Local>();
		locais1.add(local1);
		locais1.add(local3);
		locais1.add(local5);

		ArrayList<Local> locais2 = new ArrayList<Local>();
		locais2.add(local1);
		locais2.add(local3);
		locais2.add(local2);
		locais2.add(local6);
		locais2.add(local5);

		localRepository.save(local1);
		localRepository.save(local2);
		localRepository.save(local3);
		localRepository.save(local4);
		localRepository.save(local5);
		localRepository.save(local6);

		funcionario2.setContato("82 98888-9878");
		funcionario2.setEmail("jaciara.silva@organizacao.com");
		funcionario2.setMatricula(64877);
		funcionario2.setNome("Jaciara da Silva Santos");

		funcionarioRepository.save(funcionario2);

		reserva1.setDt_vencimento(new GregorianCalendar(2017, 02, 01));
		reserva1.setLocais(locais1);
		reserva1.setStatus(false);
		reserva1.setUsuario(pj1);
		reserva1.setValor(reserva1.somaLocais(locais1));
		reserva1.setFuncionario(funcionario2);

		reservaRepository.save(reserva1);

		// PAGAMENTO
		pagamento1.setDt_pagemento(new GregorianCalendar(2017, 1, 9));
		pagamento1.setForma_pagamento("BOLETO");
		pagamento1.setReserva(reserva1);
		pagamento1.setValor(reserva1.getValor());

		pagamentoRepository.save(pagamento1);

		reserva2.setDt_vencimento(new GregorianCalendar(2017, 1, 10));
		reserva2.setLocais(locais2);
		reserva2.setStatus(false);
		reserva2.setUsuario(pf1);
		reserva2.setValor(reserva2.somaLocais(locais2));
		reserva2.setFuncionario(funcionario2);

		reservaRepository.save(reserva2);

		// PAGAMENTO 
		/*
		pagamento2.setDt_pagemento(new GregorianCalendar(2017, 1, 9));
		pagamento2.setForma_pagamento("BOLETO");
		pagamento2.setReserva(reserva1);
		pagamento2.setValor(reserva1.getValor());

		pagamentoRepository.save(pagamento1); 
		
		System.out.println(pagamentoRepository.findByReservaId(reserva1.getId()));
		*/
		if (pagamentoRepository.findByReservaId(reserva1.getId()) != null) {
			System.out.println("valor retornado");
			reserva1.setStatus(true);
			reservaRepository.save(reserva1);
			// verificar se o pagamento foi efetuado
			evento1.setReserva(reserva1);
			evento1.setDatainicio(new GregorianCalendar(2017, 10, 1));
			evento1.setDatafim(new GregorianCalendar(2017, 10, 10));
			evento1.setNome("FORMATURA DE MEDICINA - UFAL");
			evento1.setTipoEvento(tipoEvento1);

			eventoRepository.save(evento1);
		} else {
			System.out.println("sem retorno");
		}
		
	}
}
