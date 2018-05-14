package com.example.BrandManagment.service.Impl;

import com.example.BrandManagment.model.Brand;
import com.example.BrandManagment.repository.BrandRepository;
import com.example.BrandManagment.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Override
    public void saveBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public Brand getBrand(Integer id) {
        return brandRepository.findOne(id);
    }

    @Override
    public void deleteBrand(Integer id) {
        brandRepository.delete(id);
    }

    @Override
    public void updateBrand(Brand brand) {
        brandRepository.saveAndFlush(brand);
    }

    @Override
    public List<Brand> findAll() {
        List<Brand> brands = brandRepository.findAll();
        for(Brand brand: brands){
            System.out.println("***"+brand.getBrandName());
        }
        return brands;
    }
}
