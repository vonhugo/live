package com.example.live.product;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "eancode")
    private String eancode;

    @Column(name = "category_id")
    private Long category_id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private String model;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "price")
    private Long price;

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEancode() { return eancode; }

    public void setEancode(String eancode) { this.eancode = eancode; }

    public Long getCategory_id() { return category_id; }

    public void setCategory_id(Long category_id) { this.category_id = category_id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getMark() { return mark; }

    public void setMark(String mark) { this.mark = mark; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public Long getStock() { return stock; }

    public void setStock(Long stock) { this.stock = stock; }

    public Long getPrice() { return price; }

    public void setPrice(Long price) { this.price = price; }
}
