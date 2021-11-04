package com.algaworks.springmongodb.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.springmongodb.domain.model.Funcionario;
import com.algaworks.springmongodb.domain.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
@CrossOrigin("*")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping
	public List<Funcionario> getAll() {
		return this.funcionarioService.getAll();
	}

	@GetMapping("/{codigo}")
	public Funcionario getById(@PathVariable String codigo) {
		return this.funcionarioService.getById(codigo);
	}

	@GetMapping("/range")
	public List<Funcionario> getFuncionariosByAgeRange(@RequestParam("de") Integer de,
			@RequestParam("ate") Integer ate) {
		return this.funcionarioService.getFuncionariosByAgeRange(de, ate);
	}

	@PostMapping
	public Funcionario criar(@RequestBody Funcionario funcionario) {
		return this.funcionarioService.create(funcionario);
	}

}
