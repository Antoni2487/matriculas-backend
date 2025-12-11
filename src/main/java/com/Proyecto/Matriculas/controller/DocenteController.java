package com.Proyecto.Matriculas.controller;

import com.Proyecto.Matriculas.entity.Docente;
import com.Proyecto.Matriculas.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/docentes") 
@CrossOrigin(origins = "*")    
public class DocenteController {

    @Autowired
    private DocenteRepository repository;

    @GetMapping
    public List<Docente> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Docente guardar(@RequestBody Docente docente) {
        return repository.save(docente);
    }
}