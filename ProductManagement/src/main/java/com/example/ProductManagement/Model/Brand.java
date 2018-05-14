package com.example.ProductManagement.Model;

import javax.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Prodcut product_id;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Prodcut getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Prodcut product_id) {
        this.product_id = product_id;
    }
}
