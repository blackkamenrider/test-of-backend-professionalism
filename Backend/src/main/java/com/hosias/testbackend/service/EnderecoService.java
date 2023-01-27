package com.hosias.testbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosias.testbackend.entities.Endereco;
import com.hosias.testbackend.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	   public List<Endereco> findAll(){
			
			return enderecoRepository.findAll();
		}

}
