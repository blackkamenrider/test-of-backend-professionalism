package com.hosias.testbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosias.testbackend.entities.Pessoa;
import com.hosias.testbackend.repository.PessoaRepository;

@Service
public class PessoaService {

   @Autowired
   private PessoaRepository pessoaRepository;
	
  //Listar pessoas  
   public List<Pessoa> findAll(){
		
		return pessoaRepository.findAll();
	}
   
   
   
  
}
