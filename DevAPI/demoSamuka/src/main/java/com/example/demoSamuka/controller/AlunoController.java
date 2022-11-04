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

    @DeleteMapping ("/remover")
    public void deletaAluno(@RequestBody Aluno al) {
        alRepo.delete(al);
    }

    @PutMapping ("/atualizar")
    public void atualizarAluno(@RequestBody Aluno al) {
        alRepo.save(al);

    }

    @GetMapping ("/nome/{nome}")
    public List<Aluno> listaPorNome (@PathVariable (value="nome") String nome) {
        return alRepo.findByNome(nome);
    }

    @GetMapping ("/raMaior/{ra}")
    public List<Aluno> listarPorRaMaior (@PathVariable (value="ra") int ra) {
        return alRepo.findByRaMaior(ra);
    }

    @GetMapping ("/nomeEspec/{nome}")
    public List<Aluno> listarPorNomeEspec (@PathVariable (value="nome") String nome) {
        return alRepo.findByNomeEspec(nome);
    }
}
