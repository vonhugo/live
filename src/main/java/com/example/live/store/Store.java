package com.example.live.store;

import jakarta.persistence.*;

@Entity
@Table(name = "stores")
public class Store {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}