package com.practical.practicewebwithh2.repo;

import com.practical.practicewebwithh2.model.Price;
import com.practical.practicewebwithh2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product,Long> {
    /*public Product getProduct(){
        return new Product("Apple", List.of(new Price(BigDecimal.valueOf(50.5), Date.valueOf("2024-12-12"))));
    }*/

    List<Product> findByCusip(String cusip);

    List<Product> findAll();
}
