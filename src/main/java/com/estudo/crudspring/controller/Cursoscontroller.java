package com.estudo.crudspring.controller;

import java.util.List;

import com.estudo.crudspring.model.Curso;
import com.estudo.crudspring.repository.Cursorepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class Cursoscontroller {

    private final Cursorepository cursorepository;

    @GetMapping
    public  List<Curso> list() {

        return cursorepository.findAll();
    }
    
}
