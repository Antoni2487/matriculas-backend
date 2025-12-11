package com.Proyecto.Matriculas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer creditos;

    // Simplificación para MVP: Horarios y Ambientes como texto
    // Ej: "Lunes 08:00 - 10:00"
    private String horario; 
    // Ej: "Laboratorio 3" o "Aula 101"
    private String ambiente; 

    @ManyToOne
    @JoinColumn(name = "docente_id")

    private Docente docente;
}