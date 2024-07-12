package com.practical.practicewebwithh2.service;

import com.practical.practicewebwithh2.model.Product;
import com.practical.practicewebwithh2.repo.ProductDAO;
import com.practical.practicewebwithh2.repo.TestBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDAO productDAO;

    @Autowired
    TestBeans testBeans;


    public List<Product> getProduct(){
        return productDAO.findAll();
    }

    public List<Product> getProductByCusip(String cusip){
        return productDAO.findByCusip(cusip);
    }

    public Product addProduct(Product product) {
        return productDAO.save(product);
    }
}
