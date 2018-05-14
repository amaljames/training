package com.example.BrandManagment.service.Impl;

import com.example.BrandManagment.model.Category;
import com.example.BrandManagment.repository.CategoryRepository;
import com.example.BrandManagment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category getCategory(Integer id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepository.delete(id);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.saveAndFlush(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
