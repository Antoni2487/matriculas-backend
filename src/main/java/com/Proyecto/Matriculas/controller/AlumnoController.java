package com.Proyecto.Matriculas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Proyecto.Matriculas.entity.Alumno;
import com.Proyecto.Matriculas.repository.AlumnoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(origins = "*") 
public class AlumnoController {

    @Autowired private AlumnoRepository repository;

    @GetMapping
    public List<Alumno> listar() { return repository.findAll(); }

    @PostMapping
    public Alumno guardar(@RequestBody Alumno alumno) { return repository.save(alumno); }
    
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { repository.deleteById(id); }
}