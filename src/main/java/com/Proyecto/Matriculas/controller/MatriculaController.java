package com.Proyecto.Matriculas.controller;

import com.Proyecto.Matriculas.entity.Matriculas;
import com.Proyecto.Matriculas.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
@CrossOrigin(origins = "*")
public class MatriculaController {

    @Autowired private MatriculaRepository repository;

    @GetMapping
    public List<Matriculas> listar() { 
        return repository.findAll(); 
    }

    @PostMapping
    public Matriculas matricular(@RequestBody Matriculas matricula) {
        // Aquí podrías validar si ya está matriculado, pero por tiempo lo guardamos directo
        return repository.save(matricula);
    }

    // Endpoint para REPORTES
    @GetMapping("/reporte/{cursoId}")
    public List<Matriculas> reportePorCurso(@PathVariable Long cursoId) {
        return repository.findByCursoId(cursoId);
    }
}