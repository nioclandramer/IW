package com.IntWeb.Entidades;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalTime horaInicio;
    @Column(nullable = false)
    private LocalTime horaFinal;
    @Column(nullable = true)
    private String videoUrl;
}
