package com.biblioteca.gerencidor.repository;

import com.biblioteca.gerencidor.model.Catalogacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogacaoRepository extends JpaRepository<Catalogacao, Long> {

}
