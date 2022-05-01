package com.estudo.crudspring.repository;

import com.estudo.crudspring.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cursorepository extends JpaRepository<Curso, Long> {
    
}
