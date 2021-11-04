package com.algaworks.springmongodb.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
