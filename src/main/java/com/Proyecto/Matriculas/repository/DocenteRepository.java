package com.Proyecto.Matriculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Proyecto.Matriculas.entity.Docente;



@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
    
}
