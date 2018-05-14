package com.example.ProductManagement.Repository;

import com.example.ProductManagement.Model.Prodcut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdcutRepository extends JpaRepository<Prodcut,Integer> {
}
