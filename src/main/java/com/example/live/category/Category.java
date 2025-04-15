package com.example.live.category;

import com.example.live.product.Product;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "categoryDescription")
    private String categoryDescription;

    @Column(name = "categoryType")
    private Long categoryType;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getCategoryName() { return categoryName; }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() { return categoryDescription; }

    public void setCategoryDescription(String categoryDescription) { this.categoryDescription = categoryDescription; }

    public Long getCategoryType() { return categoryType; }

    public void setCategoryType(Long categoryType) {
        this.categoryType = categoryType;
    }
}