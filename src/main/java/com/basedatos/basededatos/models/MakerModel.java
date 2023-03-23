package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "maker")
public class MakerModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
}
