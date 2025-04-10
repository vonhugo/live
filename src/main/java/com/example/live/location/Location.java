package com.example.live.location;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "locationName")
    private String locationName;

    @Column(name = "locationDescription")
    private String locationDescription;

    @Column(name = "locationType")
    private Long locationType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationName() { return locationName; }

    public void setLocationName(String locationName) { this.locationName = locationName; }

    public String setLocationDescription() { return locationDescription; }

    public Long getLocationType() { return locationType; }

    public void setLocationType(Long categoryType) {
        this.locationType = locationType;
    }

}

