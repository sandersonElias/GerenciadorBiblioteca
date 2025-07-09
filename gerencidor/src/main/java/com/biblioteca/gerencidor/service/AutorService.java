package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.Autor;
import com.biblioteca.gerencidor.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    public Autor insertAutor(@RequestBody Autor autor){
        return autorRepository.save(autor);
    }
}
