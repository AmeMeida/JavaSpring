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

import com.example.aulaWeb6.model.Professor;
import com.example.aulaWeb6.repository.ProfessorRepository;
/**
 *
 * @author taniabasso
 */

@RestController
@RequestMapping (value="/apiProfessor")
public class ProfessorController implements IController<Professor, Integer> {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Optional<Professor> findByID(Integer matricula) {
        return professorRepository.findById(matricula);
    }

    @GetMapping(value="/templates")
    public List<Professor> generateTemplates() {
        if (findAll().size() == 0) {
            professorRepository.save(new Professor("Márcia", 543));
            professorRepository.save(new Professor("Amélia", 286));
            professorRepository.save(new Professor("Larissa", 483));
        }

        return findAll();
    }

    public void add(Professor professor) {
        professorRepository.save(professor);
    }
}
