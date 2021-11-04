package com.algaworks.springmongodb.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.algaworks.springmongodb.domain.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String>{

}
