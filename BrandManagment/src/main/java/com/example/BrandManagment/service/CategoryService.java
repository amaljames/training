package com.example.BrandManagment.service;

import com.example.BrandManagment.model.Category;

import java.util.List;

public interface CategoryService {
    public void saveCategory(Category category);
    public Category getCategory(Integer id);
    public void deleteCategory(Integer id);
    public void updateCategory(Category category);
    public List<Category> findAll();
}
