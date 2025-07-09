package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.Catalogacao;
import com.biblioteca.gerencidor.repository.CatalogacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CatalogacaoService {

    @Autowired
    private CatalogacaoRepository catalogacaoRepository;

    @PostMapping
    public Catalogacao insertCatalogacao(@RequestBody Catalogacao catalogacao){
        return catalogacaoRepository.save(catalogacao);
    }
}
