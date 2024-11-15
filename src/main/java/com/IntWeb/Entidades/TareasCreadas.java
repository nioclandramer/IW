package com.IntWeb.Entidades;

import jakarta.persistence.*;

@Entity
@Table
public class TareasCreadas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descripcion;
}
