package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.Emprestimo;
import com.biblioteca.gerencidor.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @PostMapping
    public Emprestimo insertEmprestimo(@RequestBody Emprestimo emprestimo){
        return emprestimoRepository.save(emprestimo);
    }
}
