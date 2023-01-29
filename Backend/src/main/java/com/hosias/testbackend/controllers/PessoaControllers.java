package com.hosias.testbackend.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hosias.testbackend.entities.Pessoa;
import com.hosias.testbackend.service.PessoaService;

@RestController
@RequestMapping(value = "pessoas")
public class PessoaControllers {

	@Autowired
	public PessoaService pessoaService;
	
	@PostMapping
	public ResponseEntity<Pessoa> insert(@RequestBody Pessoa obj){
		
		 obj = pessoaService.insert(obj);
		
		 URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
			
			return ResponseEntity.created(uri).body(obj);	
	}
	
		
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
			
		List<Pessoa> list = pessoaService.findAll();
			
		return ResponseEntity.ok().body(list);
		}
/*		
	
	@GetMapping ("/name") 
	public ResponseEntity<Pessoa> findByName(@RequestParam(name = "name") String name){
			
       Pessoa obj = pessoaService.findByName(name);     
       
       return ResponseEntity.ok().body(obj);	
	}
*/
	
	
	@GetMapping ("/name") 
	public ResponseEntity<List<Pessoa>> findByName(@RequestParam(name = "name") String name){// 
			
      List<Pessoa>  obj = pessoaService.findByName(name);     
       
       return ResponseEntity.ok().body(obj);	
	}
	
	
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Pessoa> update(@PathVariable Long id, @RequestBody Pessoa obj){
		
		obj = pessoaService.update(id, obj);
		
		return  ResponseEntity.ok().body(obj);
	}
	
	
	
}
