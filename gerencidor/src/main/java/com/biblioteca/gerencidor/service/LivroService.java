package com.biblioteca.gerencidor.service;

import com.biblioteca.gerencidor.model.Livro;
import com.biblioteca.gerencidor.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    public Livro insertLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    public List<Livro> buscarLivroTitulo(String titulo){
        return livroRepository.findByTituloContainingIgnoreCase(titulo);
    }

    public List<Livro> buscarLivroEditora(String editora){
        return livroRepository.findByEditoraContainingIgnoreCase(editora);
    }

    public List<Livro> buscarLivroGenero(String genero){
        return livroRepository.buscaPorNomeGenero(genero);
    }

    public List<Livro> buscarLivroCatalogacao(String catalogacao){
        return livroRepository.buscarPorDescricaoCtalogacao(catalogacao);
    }

    public List<Livro> buscarLivroAutor (String autor){
        return livroRepository.buscarPorNomeDoAutor(autor);
    }
}