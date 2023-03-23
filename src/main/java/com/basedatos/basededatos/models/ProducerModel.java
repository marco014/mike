package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "producer")
public class ProducerModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private MakerModel makerModel;

}
