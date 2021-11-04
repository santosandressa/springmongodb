package com.algaworks.springmongodb.domain.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Funcionario {

	@Id
	private String codigo;

	private String nome;

	private Integer idade;

	private BigDecimal salario;

	private Funcionario chefe;

	public Funcionario() {
		super();
	}

	public Funcionario(String codigo, String nome, Integer idade, BigDecimal salario, Funcionario chefe) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.chefe = chefe;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Funcionario getChefe() {
		return chefe;
	}

	public void setChefe(Funcionario chefe) {
		this.chefe = chefe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
