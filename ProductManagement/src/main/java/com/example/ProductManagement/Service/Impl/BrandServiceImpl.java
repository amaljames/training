package com.example.ProductManagement.Service.Impl;

import com.example.ProductManagement.Model.Brand;
import com.example.ProductManagement.Repository.BrandRepository;
import com.example.ProductManagement.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandRepository brandRepository;

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getBrandById(Integer id) {
        return brandRepository.findOne(id);
    }

    @Override
    public void deleteBrandById(Integer id) {
        brandRepository.delete(id);
    }

    @Override
    public void updateBrandById(Brand brand) {
        brandRepository.saveAndFlush(brand);
    }

    @Override
    public void saveBrand(Brand brand) {
        brandRepository.save(brand);
    }
}
