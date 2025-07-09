package com.biblioteca.gerencidor.controller;

import com.biblioteca.gerencidor.model.Catalogacao;
import com.biblioteca.gerencidor.service.CatalogacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogacao")
public class CatalogacaoController {

    @Autowired
    private CatalogacaoService catalogacaoService;

    @PostMapping
    public ResponseEntity<Catalogacao> candastrarCatalogcao(@RequestBody Catalogacao catalogacao){
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogacaoService.insertCatalogacao(catalogacao));
    }
}
