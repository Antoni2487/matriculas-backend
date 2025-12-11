package com.Proyecto.Matriculas.controller;

import java.util.List;
import com.Proyecto.Matriculas.entity.Curso;
import com.Proyecto.Matriculas.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cursos")
@CrossOrigin(origins = "*")
public class CursoController {

    @Autowired 
    private CursoRepository cursoRepo;

    @GetMapping
    public List<Curso> listar() { 
        return cursoRepo.findAll(); 
    }

    @PostMapping
    public Curso guardar(@RequestBody Curso curso) { 
        return cursoRepo.save(curso); 
    }
}