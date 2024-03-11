package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Endpoint http://localhost:8080/atividade1/hello-world
//Endpoint http://localhost:8080/atividade1/bsms
//Endpoint http://localhost:8080/atividade1/objetivos

@RestController
@RequestMapping("/atividade1")
public class HelloWorldController {

	@GetMapping ("/hello-world")
	public String helloWorld() {
		
	
		return "Hello World, How are you ??";
				
	}
	
	@GetMapping("/bsms")
	public List<String> getBSMs() {
		
	
		List<String> bsmsList = Arrays.asList("Proatividade", "Comunicação", "Trabalho em Equipe",
				"Persistência", "Orientação ao Detalhe", "Mentalidade de Crescimento", "Responsabilidade Pessoal",
				"Orientação ao Futuro");
		
		return bsmsList;
	}
	
	@GetMapping("/objetivos")
	public List<String> getLearningObjectives() {
		
	
		List<String> objetivosList = Arrays.asList("Desenvolver o Projeto Integrador", "Aprender a desenvolver o Backend com Spring",
				"Comunicação", "Persistência");
		
		return objetivosList;
	
	}
}
