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
import org.springframework.data.jpa.repository.Query;
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
@RequestMapping(value = "/apiAluno")
public class AlunoController implements IController<Aluno, Integer> {
    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }
    
    public Optional<Aluno> findByID(Integer ra) {
        return alunoRepository.findById(ra);
    }

    public void add(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @GetMapping("/alunos/{nome}")
    public List<Aluno> findByNome(@PathVariable(value = "nome") String nome) {
        return alunoRepository.findByNome(nome);
    }

    @GetMapping("/busca/ra_maior/{ra}")
    public List<Aluno> findByGTRa(@PathVariable(value = "ra") Integer ra) {
        return alunoRepository.findByGTRa(ra);
    }

    @CrossOrigin
    @PostMapping("/inserir/multiplos")
    public void addRange(@RequestBody Iterable<Aluno> alunos) {
        alunoRepository.saveAll(alunos);
    }

    @GetMapping("/busca/{nome}")
    public List<Aluno> findByNomeContains(@PathVariable(value = "nome") String nome) {
        return alunoRepository.findByNomeContains(nome.toLowerCase());
    }

    @GetMapping("/busca/{ra}/{nome}")
    public List<Aluno> findByNomeRA(@PathVariable(value = "ra") Integer ra, @PathVariable(value = "nome") String nome) {
        return alunoRepository.findByNomeRA(ra, nome);
    }
}
