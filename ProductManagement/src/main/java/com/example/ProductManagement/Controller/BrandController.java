package com.example.ProductManagement.Controller;

import com.example.ProductManagement.Model.Brand;
import com.example.ProductManagement.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api")
public class BrandController {
    @Autowired
    BrandService brandService;

   @GetMapping("/allBrands")
    public List<Brand> getAllBrands(){
        return brandService.getAllBrands();
    }

    @GetMapping("/getById/{id}")
    public Brand getBrandById(@PathVariable("id") Integer id){
        return brandService.getBrandById(id);
    }
   @DeleteMapping("/deleteById/{id}")
    public String deleteBrandById(@PathVariable("id") Integer id){
        brandService.deleteBrandById(id);
        return "Deleted Succesfully";
    }
    @PutMapping("/update")
    public String updateBrandById(@RequestBody Brand brand){
        brandService.updateBrandById(brand);
        return "Updated Succesfully";
    }
    @PostMapping("/save")
    public String saveBrand(@RequestBody Brand brand){
        brandService.saveBrand(brand);
        return "Saved Succesfully";
    }
}
