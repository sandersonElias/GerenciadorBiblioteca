package com.biblioteca.gerencidor.controller;

import com.biblioteca.gerencidor.model.Emprestimo;
import com.biblioteca.gerencidor.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping
    public ResponseEntity<Emprestimo> cadastrarEmprestimo(@RequestBody Emprestimo emprestimo){
        return ResponseEntity.status(HttpStatus.CREATED).body(emprestimoService.insertEmprestimo(emprestimo));
    }
}
