package com.hosias.testbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hosias.testbackend.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	 
}
