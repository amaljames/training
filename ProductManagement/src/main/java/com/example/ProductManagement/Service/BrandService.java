package com.example.ProductManagement.Service;

import com.example.ProductManagement.Model.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> getAllBrands();
    public  Brand getBrandById(Integer id);
    public  void deleteBrandById(Integer id);
    public void updateBrandById(Brand brand);
    public  void  saveBrand(Brand brand);

}
