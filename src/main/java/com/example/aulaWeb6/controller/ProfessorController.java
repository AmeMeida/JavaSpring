/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aulaWeb6.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* *
import com.example.aulaWeb6.model.Professor;
import com.example.aulaWeb6.repository.ProfessorRepository;

/**
 *
 * @author taniabasso
 *

@RestController
@RequestMapping (value="/apiAluno")
public class ProfessorController {
    
    @Autowired
    ProfessorRepository professorRepository;
    
    
    @GetMapping (value="/professor")
    public List<Professor> listarAlunos() {
        return professorRepository.findAll();
    }
    
    @GetMapping (value="/professor/{matricula}")
    public Optional<Professor> listarAlunosPorRA(@PathVariable (value="matricula") int matricula) {
        return professorRepository.findById(matricula);
    }
    
    @CrossOrigin
    @PostMapping("/inserirProfessor")
    public void inserirAlunos (@RequestBody Professor professor) {
        professorRepository.save(professor);
    }
}

* */