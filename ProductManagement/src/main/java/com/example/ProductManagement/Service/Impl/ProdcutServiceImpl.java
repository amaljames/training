package com.example.ProductManagement.Service.Impl;

import com.example.ProductManagement.Model.Prodcut;
import com.example.ProductManagement.Repository.ProdcutRepository;
import com.example.ProductManagement.Service.ProdcutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdcutServiceImpl implements ProdcutService {

    @Autowired
    ProdcutRepository prodcutRepository;
    @Override
    public List<Prodcut> getAllProducts() {
        return prodcutRepository.findAll();
    }

    @Override
    public Prodcut getProductById(Integer id) {
        return prodcutRepository.findOne(id);
    }

    @Override
    public void deleteProductById(Integer id) {
    prodcutRepository.delete(id);
    }

    @Override
    public void updateProductById(Prodcut prodcut) {
        prodcutRepository.saveAndFlush(prodcut);
    }

    @Override
    public void saveProduct(Prodcut prodcut) {
         prodcutRepository.save(prodcut);
    }
}
