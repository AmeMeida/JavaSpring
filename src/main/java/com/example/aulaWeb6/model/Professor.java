/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.aulaWeb6.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author aluno
 */

@Entity
@Table (name = "ProfWeb")
public class Professor {
    private String nome;
    private int matricula;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
