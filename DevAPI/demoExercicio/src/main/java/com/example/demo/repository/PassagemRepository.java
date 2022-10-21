package com.example.demo.repository;

import com.example.demo.model.Passagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassagemRepository extends JpaRepository <Passagem,Integer> {

}
