package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value="/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository cliRepo;

    @GetMapping (value="/cliente/{cod}")
    public Optional<Cliente> buscaPorCod
            (@PathVariable(value="cod") int cod) {
        return cliRepo.findById(cod);
    }

    @GetMapping (value="/cliente/{nome}")
    public List<Cliente> buscaPorNome
            (@PathVariable (value="nome") String nome) {
        return cliRepo.findByNome(nome);
    }

    @GetMapping (value="/cliente/{email}")
    public List<Cliente> buscaPorEmail
            (@PathVariable (value="email") String email) {
        return cliRepo.findByEmail(email);
    }

    @GetMapping (value="/inicialNome/{nome}")
    public List<Cliente> buscaPorInicialNome
            (@PathVariable (value="nome") String nome ) {
        return cliRepo.findByInicialNome(nome);
    }

    @GetMapping (value="/inicialEmail/{email}")
    public List<Cliente> buscaPorInicialEmail
            (@PathVariable (value="email") String email ) {
        return cliRepo.findByInicialEmail(email);
    }

    @GetMapping (value="/inicialNomeEmail/{nome}/{email}")
    public List<Cliente> buscaPorInicialNomeEmail
            (@PathVariable (value="nome") String nome,
             @PathVariable (value="email") String email) {
        return cliRepo.findByInicialNomeEmail(nome, email);
    }

    @GetMapping (value="/codMaior/{cod}")
    public List<Cliente> buscaCodMaiorQue
            (@PathVariable (value="cod") int cod ) {
        return cliRepo.findByCodMaiorQue(cod);
    }

    @PostMapping ("/inserir")
    public void inserirClientes
            (@RequestBody Cliente cli) {
        cliRepo.save(cli);
    }

    @DeleteMapping ("/remover")
    public void deletarCliente
            (@RequestBody Cliente cli) {
        cliRepo.delete(cli);
    }

    @PutMapping ("/atualizar")
    public void atualizarCliente
            (@RequestBody Cliente cli) {
        cliRepo.save(cli);
    }

}
