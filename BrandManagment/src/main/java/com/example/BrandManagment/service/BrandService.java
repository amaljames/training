package com.example.BrandManagment.service;

import com.example.BrandManagment.model.Brand;
import com.example.BrandManagment.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public interface BrandService {

    public void saveBrand(Brand brand);
    public Brand getBrand(Integer id);
    public void deleteBrand(Integer id);
    public void updateBrand(Brand brand);
    public List<Brand> findAll();

}
