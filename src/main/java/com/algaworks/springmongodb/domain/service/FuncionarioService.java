package com.algaworks.springmongodb.domain.service;

import java.util.List;

import com.algaworks.springmongodb.domain.model.Funcionario;

public interface FuncionarioService {
	
	public List<Funcionario> getAll();
	
	public Funcionario getById(String codigo);
	
	public Funcionario create(Funcionario funcionario);
	
}
