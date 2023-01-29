package com.hosias.testbackend.entities;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name= "tb_endereco")
public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String logradouro;
	private String cep;
	private Integer numero;
	private String cidade;
	private Boolean endPrincipal;
	
	@ManyToOne
	@JoinColumn(name = "pessoa-endereco")
    @Autowired
	private Pessoa pessoa;
	
	public Endereco() {
		super();
	}


	public Endereco(String logradouro, String cep, Integer numero, String cidade,Pessoa pessoa, Boolean endPrincipal) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.cidade = cidade;
		this.setEndPrincipal(endPrincipal);
		this.pessoa = pessoa;
	}
	

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
/**/	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getEndPrincipal() {
		return endPrincipal;
	}


	public void setEndPrincipal(Boolean endPrincipal) {
		this.endPrincipal = endPrincipal;
	}

/*
	public Pessoa getPessoa() {
		return pessoa;
	}

*/
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
