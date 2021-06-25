package com.prueba.valid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.valid.entity.Persona;

// se extiende con jpaRepository para usar varias utilidades de spring
public interface PersonaDAO extends JpaRepository<Persona, Long> {


}
