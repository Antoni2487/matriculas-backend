package com.Proyecto.Matriculas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Proyecto.Matriculas.entity.Matriculas;
import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matriculas, Long> {
    
    List<Matriculas> findByCursoId(Long cursoId);
}
