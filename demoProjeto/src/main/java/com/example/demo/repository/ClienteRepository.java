package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    public List<Cliente> findByNome(String nome);

    public List<Cliente> findByEmail(String email);

    @Query (value="SELECT c FROM Cliente c WHERE c.nome like ?1%")
    List<Cliente> findByInicialNome(String nome);

    @Query (value="SELECT c FROM Cliente c WHERE c.cod > ?1")
    List<Cliente> findByCodMaiorQue(int cod);

    @Query (value="SELECT c FROM Cliente c WHERE c.email like ?1%")
    List<Cliente> findByInicialEmail(String email);

    @Query (value="SELECT c FROM Cliente c WHERE c.nome LIKE ?1% AND c.email LIKE ?2%")
    List<Cliente> findByInicialNomeEmail(String nome, String email);
}
