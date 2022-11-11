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

    // http://localhost:8080/apiProduto/produto/123
    // FUNCIONAL
    @GetMapping (value="/produto/{cod}")
    public Optional<Produto> buscaPorCod
            (@PathVariable (value="cod") int cod) {
        return pRepo.findById(cod);
    }

    // http://localhost:8080/apiProduto/descr/Mouse
    // FUNCIONAL
    @GetMapping (value="/descr/{descr}")
    public List<Produto> buscaPorDescr
            (@PathVariable (value="descr") String descr) {
        return pRepo.findByDescr(descr);
    }

    // http://localhost:8080/apiProduto/marca/Logi
    // FUNCIONAL
    @GetMapping (value="/marca/{marca}")
    public List<Produto> buscaPorMarca
            (@PathVariable (value="marca") String marca) {
        return pRepo.findByMarca(marca);
    }

    // http://localhost:8080/apiProduto/preco/125
    // FUNCIONAL
    @GetMapping (value="/preco/{preco}")
    public List<Produto> buscaPorPreco
            (@PathVariable (value="preco") double preco) {
        return pRepo.findByPreco(preco);
    }

    // http://localhost:8080/apiProduto/inicialDescr/tec
    // FUNCIONAL
    @GetMapping (value="/inicialDescr/{descr}")
    public List<Produto> buscaPorInicialDescr
            (@PathVariable (value="descr") String descr) {
        return pRepo.findByInicialDescr(descr);
    }

    // http://localhost:8080/apiProduto/inicialMarca/hy
    // FUNCIONAL
    @GetMapping (value="/inicialMarca/{marca}")
    public List<Produto> buscaPorInicialMarca
            (@PathVariable (value="marca") String marca) {
        return pRepo.findByInicialMarca(marca);
    }

    // http://localhost:8080/apiProduto/precoMaior/300
    // FUNCIONAL
    @GetMapping (value="/precoMaior/{preco}")
    public List<Produto> buscaPorPrecoMaior
            (@PathVariable (value="preco") double preco) {
        return pRepo.findByPrecoMaior(preco);
    }

    // http://localhost:8080/apiProduto/precoMenor/250
    // FUNCIONAL
    @GetMapping (value="/precoMenor/{preco}")
    public List<Produto> buscaPorPrecoMenor
            (@PathVariable (value="preco") double preco) {
        return pRepo.findByPrecoMenor(preco);
    }

    // http://localhost:8080/apiProduto/descrMarca/ec/hy
    // FUNCIONAL
    @GetMapping (value="/descrMarca/{descr}/{marca}")
    public List<Produto> buscaDescriMarca
            (@PathVariable (value="descr") String descr,
             @PathVariable (value="marca") String marca) {
        return pRepo.findByDescriMarca(descr, marca);
    }

    // http://localhost:8080/apiProduto/descrPreco/ec/350
    // FUNCIONAL
    @GetMapping (value="/descrPreco/{descr}/{preco}")
    public  List<Produto> buscaDescriPrecoMenor
            (@PathVariable (value="descr") String descr,
             @PathVariable (value="preco") double preco) {
        return pRepo.findByDescriPrecoMenor(descr, preco);
    }

    // http://localhost:8080/apiProduto/inserir
    // FUNCIONAL
    @PostMapping("/inserir")
    public void inserirProduto
            (@RequestBody Produto p) {
        pRepo.save(p);
    }

    // http://localhost:8080/apiProduto/remover
    // FUNCIONAL
    @DeleteMapping("/remover")
    public void deletarProduto
            (@RequestBody Produto p) {
        pRepo.delete(p);
    }

    // http://localhost:8080/apiProduto/atualizar
    // FUNCIONAL
    @PutMapping("/atualizar")
    public void atualizarProduto
            (@RequestBody Produto p) {
        pRepo.save(p);
    }
    /*
    {
        "cod": n,
        "descr": "n",
        "marca": "n",
        "preco": n
    }
     */


}
