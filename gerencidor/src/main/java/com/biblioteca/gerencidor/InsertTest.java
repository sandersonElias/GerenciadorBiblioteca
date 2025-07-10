/*
package com.biblioteca.gerencidor;

import com.biblioteca.gerencidor.model.*;
import com.biblioteca.gerencidor.repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class InsertTest {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private CDDRepository cddRepository;

    @Autowired
    private CatalogacaoRepository catalogacaoRepository;


    @PostConstruct
    public void values(){

        try {
            Genero genero = new Genero();
            genero.setNome("Novela");
            generoRepository.save(genero);

            Autor autor = new Autor();
            autor.setNome("Antoine de Saint-Exupéry");
            autorRepository.save(autor);

            CDD cdd = new CDD();
            cdd.setCodigo("823");
            cdd.setDescricao("Literatura Infantil.");
            cddRepository.save(cdd);

            Catalogacao catalogacao = new Catalogacao();
            catalogacao.setCodigo("002");
            catalogacao.setDescricao("Obras Infantis.");
            catalogacaoRepository.save(catalogacao);

            Livro livro = new Livro();
            livro.setTitulo("O Pequeno Principe");
            livro.setEditora("TestComplemento");
            livro.setLocalizacao("A 11 PT 34");
            livro.setDataRegistro(LocalDate.now());
            livro.setQuantidadeTotal(1);
            livro.setQuantidadeDisponivel(1);
            livro.setGenero(genero);
            livro.setCatalogacao(catalogacao);
            livro.setCdd(cdd);
            livro.setAutor(Set.of(autor));
            livroRepository.save(livro);

            System.out.println("Sucesso.");
        }catch (Exception e){
            System.out.println("Erro"+ e.getMessage());
            e.printStackTrace();
        }
    }
}
*/