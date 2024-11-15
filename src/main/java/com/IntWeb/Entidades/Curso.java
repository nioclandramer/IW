package com.IntWeb.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombreCurso;
    @Column(nullable = false)
    private String descripcion;
    @ManyToMany
    @JoinTable(
            name = "CursoMonitor",
            joinColumns = @JoinColumn(name = "CursoId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "MonitorId", referencedColumnName = "id")
    )
    private List<Monitor> monitores;
}
