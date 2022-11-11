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

    @Query (value="SELECT p FROM Produto p WHERE p.preco > ?1")
    List<Produto> findByPrecoMaior(double preco);

    @Query (value="SELECT p FROM Produto p WHERE p.preco < ?1")
    List<Produto> findByPrecoMenor(double preco);


    @Query (value = "SELECT p FROM Produto p WHERE p.descr LIKE %?1% AND p.marca LIKE %?2%")
    List<Produto> findByDescriMarca(String descr, String marca);

    @Query("SELECT p FROM Produto p where p.descr LIKE %?1% AND p.preco < ?2")
    List<Produto> findByDescriPrecoMenor(String descr, double preco);
}
