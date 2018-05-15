package com.example.ProductManagement.Service;

import com.example.ProductManagement.Model.Prodcut;

import java.util.List;

public interface ProdcutService {
    public List<Prodcut> getAllProducts();
    public Prodcut getProductById(Integer id);
    public void deleteProductById(Integer id);
    public void updateProductById(Prodcut prodcut);
    public  void saveProduct(Prodcut prodcut);

}
