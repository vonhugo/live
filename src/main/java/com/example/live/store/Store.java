package com.example.live.store;

import jakarta.persistence.*;

@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "namestore")
    private String name;

    @Column(name = "sector")
    private String sector;

    @Column(name = "room")
    private String room;

    @Column(name = "rack")
    private String rack;

    @Column(name = "box")
    private String box;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "level")
    private String level;

    @Column(name = "positionx")
    private String positionx;

    @Column(name = "positiony")
    private String positiony;

    @Column(name = "posicionz")
    private String positionz;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSector() { return sector; }

    public void setSector(String sector) { this.sector = sector; }

    public String getRoom() { return room; }

    public void setRoom(String room) { this.room = room; }

    public String getRack() { return rack; }

    public void setRack(String rack) { this.rack = rack; }

    public String getBox() { return box; }

    public void setBox(String box) { this.box = box; }

    public Boolean getActive() { return active; }

    public void setActive(Boolean active) { this.active = active; }

    public String getLevel() { return level; }

    public void setLevel(String level) { this.level = level; }

    public String getPositionx() { return positionx; }

    public void setPositionx(String positionx) { this.positionx = positionx; }

    public String getPositiony() { return positiony; }

    public void setPositiony(String positiony) { this.positiony = positiony; }

    public String getPositionz() { return positionz; }

    public void setPositionz(String positionz) { this.positionz = positionz; }

}