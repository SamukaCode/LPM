package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value="/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository cliRepo;

    @GetMapping (value="/all")
    public List<Cliente> buscartodos() {
        return cliRepo.findAll();
    }
}
