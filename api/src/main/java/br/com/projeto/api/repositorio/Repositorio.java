package br.com.projeto.api.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

    @SuppressWarnings("null")
    List<Pessoa> findAll();

   Pessoa findById(int codigo);

// List<Pessoa> findByOrderName();
   
//    List<Pessoa> findByNomeContaining(String termo);

   @Query(value = "SELECT SUN(idade) FROM tb_pessoas", nativeQuery = true)
   int somaIdade();



   
}
