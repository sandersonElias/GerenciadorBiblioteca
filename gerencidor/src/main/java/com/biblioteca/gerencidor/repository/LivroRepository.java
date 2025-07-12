package com.biblioteca.gerencidor.repository;

import com.biblioteca.gerencidor.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
  List<Livro> findByTituloContainingIgnoreCase(String titulo);

  List<Livro> findByEditoraContainingIgnoreCase(String editora);

  @Query("SELECT I FROM Livro I JOIN I.autor a WHERE LOWER(a.nome) LIKE LOWER(CONCAT('%',:nomeAutor,'%'))")
  List<Livro> buscarPorNomeDoAutor(@Param("nomeAutor") String nomeAutor);

  @Query("SELECT I FROM Livro I JOIN I.genero g WHERE LOWER(g.nome) LIKE LOWER(CONCAT('%',:nomeGenero,'%'))")
  List<Livro> buscaPorNomeGenero(@Param("nomeGenero") String nomeGenero);

  @Query("SELECT I FROM Livro I JOIN I.catalogacao c WHERE LOWER(c.descricao) LIKE LOWER(CONCAT('%',:descCatalogacao,'%'))")
  List<Livro> buscarPorDescricaoCtalogacao(@Param("descricaoCatalogacao") String descricaoCatalogacao);
}
