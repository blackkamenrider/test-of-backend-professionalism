package com.hosias.testbackend.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name= "tb_pessoa")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	//para garantir que minha dataNasc seja Mostrado la no Json com o formato string do iso 8601 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
	private Instant dataNascimento;
	
	@OneToMany(mappedBy = "pessoa")
	private List<Endereco> endereco = new ArrayList<>();

	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, String  dataNascimento ) {
		super();
		this.nome = nome;
		this.dataNascimento =  Instant.parse(dataNascimento);  
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getDataNacismento() {
		return dataNascimento;
	}

	public void setDataNacismento( Instant dataNacismento) {
		
		this.dataNascimento = dataNacismento; 
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, endereco, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome);
	} 
	
}
