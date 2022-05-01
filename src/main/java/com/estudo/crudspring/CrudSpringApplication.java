package com.estudo.crudspring;

import com.estudo.crudspring.model.Curso;
import com.estudo.crudspring.repository.Cursorepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
    

	//exemplo banco de dados
	@Bean 
	CommandLineRunner initDatabase(Cursorepository cursorepository){
          return args -> {
             cursorepository.deleteAll();

			 Curso c = new Curso();
			 c.setName("Api Spring");
			 c.setCategory("Back-End");

			 cursorepository.save(c);
		  };
	}
}
