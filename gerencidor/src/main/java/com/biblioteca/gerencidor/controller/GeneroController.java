package com.biblioteca.gerencidor.controller;

import com.biblioteca.gerencidor.model.Genero;
import com.biblioteca.gerencidor.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @PostMapping
    public ResponseEntity<Genero> cadastrarGenero(@RequestBody Genero genero){
        return ResponseEntity.status(HttpStatus.CREATED).body(generoService.insertGenero(genero));
    }
}
