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

    // http://localhost:8080/apiCliente/cliente/2
    // FUNCIONAL
    @GetMapping (value="/cliente/{cod}")
    public Optional<Cliente> buscaPorCod
            (@PathVariable(value="cod") int cod) {
        return cliRepo.findById(cod);
    }

    // http://localhost:8080/apiCliente/nome/Samuka
    // FUNCIONAL
    @GetMapping (value="/nome/{nome}")
    public List<Cliente> buscaPorNome
            (@PathVariable (value="nome") String nome) {
        return cliRepo.findByNome(nome);
    }

    // http://localhost:8080/apiCliente/email/sa@gmail.com
    // FUNCIONAL
    @GetMapping (value="/email/{email}")
    public List<Cliente> buscaPorEmail
            (@PathVariable (value="email") String email) {
        return cliRepo.findByEmail(email);
    }

    // http://localhost:8080/apiCliente/inicialNome/Na
    // FUNCIONAL
    @GetMapping (value="/inicialNome/{nome}")
    public List<Cliente> buscaPorInicialNome
            (@PathVariable (value="nome") String nome ) {
        return cliRepo.findByInicialNome(nome);
    }

    // http://localhost:8080/apiCliente/inicialEmail/nat@
    // FUNCIONAL
    @GetMapping (value="/inicialEmail/{email}")
    public List<Cliente> buscaPorInicialEmail
            (@PathVariable (value="email") String email ) {
        return cliRepo.findByInicialEmail(email);
    }

    // http://localhost:8080/apiCliente/inicialNomeEmail/Sa/sa
    // FUNCIONAL
    @GetMapping (value="/inicialNomeEmail/{nome}/{email}")
    public List<Cliente> buscaPorInicialNomeEmail
            (@PathVariable (value="nome") String nome,
             @PathVariable (value="email") String email) {
        return cliRepo.findByInicialNomeEmail(nome, email);
    }

    // http://localhost:8080/apiCliente/codMaior/2
    // FUNCIONAL
    @GetMapping (value="/codMaior/{cod}")
    public List<Cliente> buscaCodMaiorQue
            (@PathVariable (value="cod") int cod ) {
        return cliRepo.findByCodMaiorQue(cod);
    }

    // http://localhost:8080/apiCliente/inserir
    // FUNCIONAL
    @PostMapping ("/inserir")
    public void inserirClientes
            (@RequestBody Cliente cli) {
        cliRepo.save(cli);
    }

    // http://localhost:8080/apiCliente/remover
    // FUNCIONAL
    @DeleteMapping ("/remover")
    public void deletarCliente
            (@RequestBody Cliente cli) {
        cliRepo.delete(cli);
    }

    // http://localhost:8080/apiCliente/atualizar
    // FUNCIONAL
    @PutMapping ("/atualizar")
    public void atualizarCliente
            (@RequestBody Cliente cli) {
        cliRepo.save(cli);
    }


    /*
    {
        "cod": n,
        "nome": "n",
        "email": "n"
    }
     */

}
