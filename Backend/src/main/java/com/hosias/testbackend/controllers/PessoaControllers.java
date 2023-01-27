package com.hosias.testbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hosias.testbackend.entities.Pessoa;
import com.hosias.testbackend.service.PessoaService;

@RestController
@RequestMapping(value = "pessoas")
public class PessoaControllers {

	@Autowired
	public PessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
			
		List<Pessoa> list = pessoaService.findAll();
			
		return ResponseEntity.ok().body(list);
		}
		
}
