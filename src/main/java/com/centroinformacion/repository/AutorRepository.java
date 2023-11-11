package com.centroinformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor,Integer> {

}
