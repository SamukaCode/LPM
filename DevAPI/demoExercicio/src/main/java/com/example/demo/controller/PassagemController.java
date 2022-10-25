package com.example.demo.controller;

import com.example.demo.model.Passagem;
import com.example.demo.repository.PassagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value="/apiPassagem")
public class PassagemController {

    @Autowired
    PassagemRepository passRepo;

    @GetMapping (value="/all")
    public List<Passagem> buscartodos() {
        return passRepo.findAll();
    }
}
