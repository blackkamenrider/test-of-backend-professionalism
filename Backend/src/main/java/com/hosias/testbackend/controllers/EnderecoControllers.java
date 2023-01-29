package com.hosias.testbackend.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hosias.testbackend.entities.Endereco;
import com.hosias.testbackend.service.EnderecoService;
import com.hosias.testbackend.service.PessoaService;

@RestController
@RequestMapping(value = "endereco")
public class EnderecoControllers {
	
	@Autowired
	public EnderecoService enderecoService;
	
	@Autowired
	public PessoaService pessoaService;
	
	@PostMapping
	public ResponseEntity<Endereco> insert(@RequestBody Endereco obj){
		
	    obj = enderecoService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).body(obj);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
			
		List<Endereco> list = enderecoService.findAll();
			
		return ResponseEntity.ok().body(list);
		}

}
