package com.biblioteca.gerencidor.repository;

import com.biblioteca.gerencidor.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository  extends JpaRepository<Livro, Long> {

}
