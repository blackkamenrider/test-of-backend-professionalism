package com.hosias.testbackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hosias.testbackend.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	 @Query(value = "select u from Pessoa u where u.nome like %?1%")
	 Optional<List<Pessoa>> findByName(String name);
}
