package com.biblioteca.gerencidor.repository;

import com.biblioteca.gerencidor.model.CDD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CDDRepository extends JpaRepository<CDD, Long> {
}
