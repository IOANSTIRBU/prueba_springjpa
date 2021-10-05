package com.example.prueba_springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PruebaSpringjpaApplication implements CommandLineRunner {

	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(PruebaSpringjpaApplication.class, args);
		System.out.println("Hola Mundo desde Spring JPA en main");
	}

	@Override
	public void run(String... args) throws Exception {

		Persona persona1 = new Persona(null,"Paolo","Bianchi",23);
		Persona persona2 = new Persona(null,"Mark", "Evans", 35);

		personaRepository.save(persona1);
		personaRepository.save(persona2);

		List<Persona>personas = personaRepository.findAll();
		System.out.println(personas);




	}
}
