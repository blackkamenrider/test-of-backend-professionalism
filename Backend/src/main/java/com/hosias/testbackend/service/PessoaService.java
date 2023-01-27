package com.hosias.testbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosias.testbackend.entities.Pessoa;
import com.hosias.testbackend.repository.PessoaRepository;

@Service
public class PessoaService {

   @Autowired
   private PessoaRepository pessoaRepository;
	
   public List<Pessoa> findAll(){
		
		return pessoaRepository.findAll();
	}
   
   public Pessoa  findByName(String name){	
		
		Optional<Pessoa> obj = pessoaRepository.findByName(name);
	 
	 return obj.orElseThrow();
	}
}
