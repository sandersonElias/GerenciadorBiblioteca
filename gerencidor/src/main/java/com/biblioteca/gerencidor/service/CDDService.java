package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.CDD;
import com.biblioteca.gerencidor.repository.CDDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CDDService {

    @Autowired
    private CDDRepository cddRepository;

    @PostMapping
    public CDD insertCDD(@RequestBody CDD cdd){
        return cddRepository.save(cdd);
    }
}
