package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.Genero;
import com.biblioteca.gerencidor.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    @PostMapping
    public Genero insertGenero(@RequestBody Genero genero){
        return generoRepository.save(genero);
    }
}
