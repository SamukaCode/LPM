package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value="/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository pRepo;

    @GetMapping (value="/produto/{cod}")
    public Optional<Produto> buscaPorCod
            (@PathVariable (value="cod") int cod) {
        return pRepo.findById(cod);
    }

    @GetMapping (value="/produto/{des}")
    public List<Produto> buscaPorDescr
            (@PathVariable (value="descr") String descr) {
        return pRepo.findByDescr(descr);
    }

    @GetMapping (value="/produto/{marca}")
    public List<Produto> buscaPorMarca
            (@PathVariable (value="marca") String marca) {
        return pRepo.findByMarca(marca);
    }

    @GetMapping (value="/produto/{preco}")
    public List<Produto> buscaPorPreco
            (@PathVariable (value="preco") double preco) {
        return pRepo.findByPreco(preco);
    }

    @GetMapping (value="/inicialDescr/{descr}")
    public List<Produto> buscaPorInicialDescr
            (@PathVariable (value="descr") String descr) {
        return pRepo.findByInicialDescr(descr);
    }

    @GetMapping (value="/inicialMarca/{marca}")
    public List<Produto> buscaPorInicialMarca
            (@PathVariable (value="marca") String marca) {
        return pRepo.findByInicialMarca(marca);
    }

    // FALTA:
    // - busca de produtos por preços maiores que algum informado;
    // - busca de produtos por preços menores que algum informado;
    // - busca de produtos com parte da descrição e marca informados
    // - busca de produtos com parte da descrição e preço menor que algum informado

    @PostMapping("/inserir")
    public void inserirProduto
            (@RequestBody Produto p) {
        pRepo.save(p);
    }

    @DeleteMapping("/remover")
    public void deletarProduto
            (@RequestBody Produto p) {
        pRepo.delete(p);
    }

    @PutMapping("/atualizar")
    public void atualizarProduto
            (@RequestBody Produto p) {
        pRepo.save(p);
    }


}
