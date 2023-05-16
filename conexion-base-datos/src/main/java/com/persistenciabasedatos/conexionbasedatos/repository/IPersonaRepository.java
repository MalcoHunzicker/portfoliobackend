package com.persistenciabasedatos.conexionbasedatos.repository;

import com.persistenciabasedatos.conexionbasedatos.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
