package com.biblioteca.gerencidor.repository;

import com.biblioteca.gerencidor.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
  List<Livro> findByTituloContainingIgnoreCase(String titulo);

  List<Livro> findByAutor_NomeContainingIgnoreCase(String nomeAutor);

  List<Livro> findByAutorContainingIgnoreCase(String autor);

  List<Livro> findByEditoraContainingIgnoreCase(String editora);
}
