package com.example.demoSamuka.controller;

import com.example.demoSamuka.model.Aluno;
import com.example.demoSamuka.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value="/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping (value = "/todos")
    public List<Aluno> buscarTodos(){
        return alRepo.findAll();
    }

    @GetMapping ("/aluno/{ra}")
    public Optional<Aluno> buscarporRa(@PathVariable(value="ra") int ra)
    {
        return alRepo.findById(ra);
    }

    @PostMapping ("/inserir")
    public void inserirAlunos(@RequestBody Aluno al) {
        alRepo.save(al);
    }
}
