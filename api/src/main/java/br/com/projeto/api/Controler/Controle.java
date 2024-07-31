package br.com.projeto.api.Controler;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Controle {   
    
    @GetMapping("")
    public String mensagem(){
        return "Hello, World";
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Seja bem vindo(a)";
    }

    @GetMapping("/boasvindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a)" + nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
    
    
}
