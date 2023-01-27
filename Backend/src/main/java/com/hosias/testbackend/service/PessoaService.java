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
   
 //#### INSERT ####   
   public Pessoa insert(Pessoa obj) {
		
		return pessoaRepository.save(obj);
	}
   
 //#### UPDATE ####  
	public Pessoa update(Long id, Pessoa obj) {
		
		try {
			Pessoa entity = pessoaRepository.getReferenceById(id);
			
			updateData(entity, obj);
			
			return pessoaRepository.save(entity);
		}
		catch(RuntimeException e) {
			
		}
		
		
		return obj;		
	}
	
//#### METHOD UPDATEDATA ####
		private void updateData(Pessoa entity, Pessoa obj) {
				
			entity.setNome(obj.getNome());
			entity.setDataNacismento(obj.getDataNacismento());
		}
		
	
 //#### FIND BY ALL ####
   public List<Pessoa> findAll(){
		
		return pessoaRepository.findAll();
	}
   
   public Pessoa  findByName(String name){	
		
		Optional<Pessoa> obj = pessoaRepository.findByName(name);
	 
	 return obj.orElseThrow();
	}
}
