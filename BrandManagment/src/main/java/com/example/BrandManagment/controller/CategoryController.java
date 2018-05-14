package com.example.BrandManagment.controller;

import com.example.BrandManagment.model.Category;
import com.example.BrandManagment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping
    public String saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return "saved successfully";
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable("id") Integer id){
        return categoryService.getCategory(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable("id") Integer id){
        categoryService.deleteCategory(id);
        return "deleted successfully";
    }

    @PutMapping
    public String updateCategory(@RequestBody Category category){
        categoryService.updateCategory(category);
        return "updated successfully";
    }

    @GetMapping("/findAllCategories")
    public List<Category> findAllCategories(){
        return categoryService.findAll();
    }
}
