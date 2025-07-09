package com.biblioteca.gerencidor.controller;

import com.biblioteca.gerencidor.model.Autor;
import com.biblioteca.gerencidor.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<Autor>cadastrarAutor(@RequestBody Autor autor){
        return ResponseEntity.status(HttpStatus.CREATED).body(autorService.insertAutor(autor));
    }
}
