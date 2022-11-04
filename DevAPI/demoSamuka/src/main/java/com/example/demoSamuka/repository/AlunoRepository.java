package com.example.demoSamuka.repository;

import com.example.demoSamuka.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno,Integer> {

    public List<Aluno> findByNome(String nome);

    @Query (value = "SELECT a FROM Aluno a WHERE a.ra > ?1")
    public List<Aluno> findByRaMaior (int ra);

    @Query (value=" SELECT a FROM Aluno a WHERE a.nome like %?1%")
    public List<Aluno> findByNomeEspec (String nome);

}

