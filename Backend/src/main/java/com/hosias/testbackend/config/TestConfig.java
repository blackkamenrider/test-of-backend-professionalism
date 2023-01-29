package com.hosias.testbackend.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hosias.testbackend.entities.Endereco;
import com.hosias.testbackend.entities.Pessoa;
import com.hosias.testbackend.repository.EnderecoRepository;
import com.hosias.testbackend.repository.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	PessoaRepository pessoaRepository;
	@Autowired
	EnderecoRepository enderecoRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
	 Pessoa pessoa1 = new Pessoa("Marcilane Pereira Fagundes", "2023-01-29T00:38:26Z"); 
	 Pessoa pessoa2 = new Pessoa("Attornatus","2018-10-16T00:49:30Z");
	 Pessoa pessoa3 = new Pessoa("Marcos Paula Henry","1930-02-16T15:21:30Z");
	 
	 Endereco endereco1 = new Endereco("Rua Miguel Inácio Faraco", "88705-050",355, "Tubarão", pessoa2, true);	
	 Endereco endereco2 = new Endereco("Rua Marília", "26170190", 620, "Belford Roxo", pessoa1,false);	
	 Endereco endereco3 = new Endereco("Rua Sebastião Rodrigues", "36050-510", 512, "Juiz de Fora", pessoa1,true);
	 Endereco endereco4 = new Endereco("Rua Joaquim Nabuco", "36790-510", 32, "Miraí", pessoa3,true);
	
	 
	 pessoaRepository.saveAll(Arrays.asList(pessoa1,pessoa2,pessoa3));
	 enderecoRepository.saveAll(Arrays.asList(endereco1,endereco2,endereco3,endereco4));
	 
	}
}



