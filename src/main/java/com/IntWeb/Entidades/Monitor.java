package com.IntWeb.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table
public class Monitor extends Usuario {
    @ManyToMany(mappedBy = "cursos")
    private List<Curso> Curso;
}
