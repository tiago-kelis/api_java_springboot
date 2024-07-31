package br.com.projeto.api.repositorio;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

    @SuppressWarnings("null")
    List<Pessoa> findAll();

   Pessoa findById(int codigo);

    // List<Pessoa> findByOrderByIdade();
    
}
