package com.biblioteca.gerencidor.controller;

import com.biblioteca.gerencidor.model.Livro;
import com.biblioteca.gerencidor.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro){
        Livro novoLivro = livroService.insertLivro(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
    }
}
