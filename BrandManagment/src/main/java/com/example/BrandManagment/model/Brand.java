package com.example.BrandManagment.model;

import javax.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @Column(name = "brand_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer brandId;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category categoryId;

    @Column(name = "brand_name")
    private String brandName;


    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
