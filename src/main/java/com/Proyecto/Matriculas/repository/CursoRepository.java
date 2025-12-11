package com.Proyecto.Matriculas.repository;

import com.Proyecto.Matriculas.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
