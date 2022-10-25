/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aulaWeb6.controller;

import com.example.aulaWeb6.model.Aluno;
import com.example.aulaWeb6.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author taniabasso
 */
@RestController
@RequestMapping (value="/apiAluno")
public class AlunoController implements IController<Aluno, Integer> {
    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping (value="/alunos")
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }
    
    @GetMapping (value="/alunos/{ra}")
    public Optional<Aluno> findByID(@PathVariable (value="ra") Integer ra) {
        return alunoRepository.findById(ra);
    }

    // @GetMapping (value="/alunos/nome/{nome}")
    // public Optional<Aluno> listarAlunosPorRA(@PathVariable (value="nome") String nome) {
    //     for (Aluno al: alunoalunoRepository.findAll()) {
    //         if (al.getNome().trim().toLowerCase().equals(nome.trim().toLowerCase()))
    //             return Optional.of(al);
    //     }

    //     return Optional.empty();
    // }

    @GetMapping (value="/alunos/helloworld")
    public String helloWorld() {
        return "Isa!";
    }
    
    @CrossOrigin
    @PostMapping("/inserirAluno")
    public void add(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
