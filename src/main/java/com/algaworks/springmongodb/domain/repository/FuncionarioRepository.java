package com.algaworks.springmongodb.domain.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.algaworks.springmongodb.domain.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

	@Query("{ $and: [ { 'idade' : { $gte: ?0 } }, { 'idade' : { $lte:  ?1 } } ]  }")
	public List<Funcionario> getFuncionariosByAgeRange(Integer de, Integer ate);
}
