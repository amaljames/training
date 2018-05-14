package com.example.BrandManagment.controller;

import com.example.BrandManagment.model.Brand;
import com.example.BrandManagment.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/brand")
public class BrandController {


    @Autowired
    BrandService brandService;

    @PostMapping
    public String saveBrand(@RequestBody Brand brand){
        System.out.println("----   "+brand.getBrandName());
        brandService.saveBrand(brand);
        return "saved successfully";
    }

    @GetMapping("/{id}")
    public Brand getBrand(@PathVariable("id") Integer id){
        return brandService.getBrand(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBrand(@PathVariable("id") Integer id){
        brandService.deleteBrand(id);
        return "deleted successfully";
    }

    @PutMapping
    public String updateBrand(@RequestBody Brand brand){
        brandService.updateBrand(brand);
        return "updated successfully";
    }

    @GetMapping("/findAll")
    public List<Brand> findAll(){

        return brandService.findAll();
    }

}
