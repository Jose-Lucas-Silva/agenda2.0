package br.com.joathan.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.joathan.agenda.model.Local;
import br.com.joathan.agenda.repository.LocalRepository;

@RestController
@RequestMapping("/local")
public class LocalController {

	@Autowired
	private LocalRepository localRepository;

	// @RequestMapping(method = RequestMethod.GET, path = "/listar")
	// public String listar(){
	// public Iterable<Local> listar(){
	// return localRepository.findAll();
	// localRepository.findAll();
	// return "listar.html";
	// }
	@ResponseBody
	@GetMapping("/todos")
	public Iterable<Local> todos() {
		return localRepository.findAll();
	}

}
