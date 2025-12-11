package com.Proyecto.Matriculas.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data // Lombok genera getters, setters, toString
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio") 
    private String nombre;
    
    @NotBlank
    private String dni;
    
    private String email;
}
