package br.com.joathan.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joathan.agenda.interf.EquipamentoRepository;
import br.com.joathan.agenda.model.Equipamento;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {

	@Autowired
	private EquipamentoRepository equipamentos;

	@GetMapping
	public List<Equipamento> pesquisar() {
		return (List<Equipamento>) equipamentos.findAll();
	}

	@GetMapping("/{id}")
	public Equipamento buscar(@PathVariable Long id) {
		return equipamentos.findOne(id);
	}

	@PostMapping
	public Equipamento salvar(@RequestBody Equipamento equipamento) {
		return equipamentos.save(equipamento);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		equipamentos.delete(id);
	}
}
