package com.algaworks.springmongodb.infrastructure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.springmongodb.domain.model.Funcionario;
import com.algaworks.springmongodb.domain.repository.FuncionarioRepository;
import com.algaworks.springmongodb.domain.service.FuncionarioService;

@Service
public class FuncionarioImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public List<Funcionario> getAll() {
		return this.funcionarioRepository.findAll();
	}

	@Override
	public Funcionario getById(String codigo) {
		return this.funcionarioRepository.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("Funcionario não existe"));
	}

	@Override
	public Funcionario create(Funcionario funcionario) {
		Funcionario chefe = this.funcionarioRepository.findById(funcionario.getChefe().getCodigo())
				.orElseThrow(() -> new IllegalArgumentException("Chefe Inexistente."));
		
		
		funcionario.setChefe(chefe);

		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public List<Funcionario> getFuncionariosByAgeRange(Integer de, Integer ate) {

		return this.funcionarioRepository.getFuncionariosByAgeRange(de, ate);
	}

}
