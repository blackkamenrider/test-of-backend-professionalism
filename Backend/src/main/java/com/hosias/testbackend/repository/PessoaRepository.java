package com.hosias.testbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hosias.testbackend.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
