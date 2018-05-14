package com.example.ProductManagement.Controller;

import com.example.ProductManagement.Model.Prodcut;
import com.example.ProductManagement.Service.ProdcutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodType;
import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class ProdcutController {
    @Autowired
    ProdcutService prodcutService;


    @GetMapping("/allProducts")
    public  List<Prodcut> getAllProducts(){
         return prodcutService.getAllProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Prodcut getProductById(@PathVariable("id")Integer id){
        return prodcutService.getProductById(id);
    }

    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable("id")Integer id){
        prodcutService.deleteProductById(id);
        return  "Deleted Successfully";
    }

   @PutMapping("/updateProductById")
    public String  updateProductById(@RequestBody Prodcut prodcut){
        prodcutService.updateProductById(prodcut);
        return  "Updated Successfully";
    }
   @PostMapping("/saveProduct")
    public String  saveProduct(@RequestBody Prodcut prodcut){
        prodcutService.saveProduct(prodcut);
        return  "Saved Successfully";
    }
}
