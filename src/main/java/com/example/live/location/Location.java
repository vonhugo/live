package com.example.live.location;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class Location {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}

