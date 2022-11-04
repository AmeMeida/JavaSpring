/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aulaWeb6.repository;
import com.example.aulaWeb6.model.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author taniabasso
 */
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    public List<Aluno> findByNome(String nome);

    @Query(value = "select a from Aluno a where a.ra > ?1")
    public List<Aluno> findByGTRa(Integer ra);

    @Query(value = "select a from Aluno a where LOWER(a.nome) like %?1%")
    public List<Aluno> findByNomeContains(String nome);

    @Query(value = "select a from Aluno a where a.ra >= ?1 AND LOWER(a.nome) LIKE %?2%")
    public List<Aluno> findByNomeRA(Integer ra, String nome);
}
