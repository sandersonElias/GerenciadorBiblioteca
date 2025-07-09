package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.Livro;
import com.biblioteca.gerencidor.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    public Livro insertLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }
}