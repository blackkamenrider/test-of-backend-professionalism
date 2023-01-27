package com.hosias.testbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hosias.testbackend.entities.Endereco;
import com.hosias.testbackend.service.EnderecoService;

@RestController
@RequestMapping(value = "endereco")
public class EnderecoControllers {
	
	@Autowired
	public EnderecoService enderecoService;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
			
		List<Endereco> list = enderecoService.findAll();
			
		return ResponseEntity.ok().body(list);
		}

}
