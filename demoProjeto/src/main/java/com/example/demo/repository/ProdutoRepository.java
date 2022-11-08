package com.example.demo.repository;

import com.example.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    public List<Produto> findByDescr(String descr);

    public List<Produto> findByMarca(String marca);

    public List<Produto> findByPreco(double preco);

    @Query (value="SELECT p FROM Produto p WHERE p.descr like ?1%")
    public List<Produto> findByInicialDescr(String descr);

    @Query (value="SELECT p FROM Produto p WHERE p.marca like ?1%")
    List<Produto> findByInicialMarca(String marca);
}
