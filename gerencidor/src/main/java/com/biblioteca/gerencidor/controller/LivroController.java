package com.biblioteca.gerencidor.controller;

import com.biblioteca.gerencidor.model.Livro;
import com.biblioteca.gerencidor.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro){
        Livro novoLivro = livroService.insertLivro(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/buscar/autor")
    public ResponseEntity<List<Livro>> buscarPorAutor(@RequestParam String autor){
        List<Livro> livros = livroService.buscarLivroAutor(autor);
        return ResponseEntity.ok(livros);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/buscar/titulo")
    public ResponseEntity<List<Livro>> buscarPorTitulo(@RequestParam String titulo){
        List<Livro> livros = livroService.buscarLivroTitulo(titulo);
        return ResponseEntity.ok(livros);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/buscar/editora")
    public ResponseEntity<List<Livro>> buscarPorEditora(@RequestParam String editora){
        List<Livro> livros = livroService.buscarLivroEditora(editora);
        return ResponseEntity.ok(livros);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/buscar/genero")
    public ResponseEntity<List<Livro>> buscarPorGenero(@RequestParam String genero){
        List<Livro> livros = livroService.buscarLivroGenero(genero);
        return ResponseEntity.ok(livros);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/buscar/catalogacao")
    public ResponseEntity<List<Livro>> buscarPorCatalogacao(@RequestParam String catalogacao){
        List<Livro> livros = livroService.buscarLivroCatalogacao(catalogacao);
        return ResponseEntity.ok(livros);
    }
}
