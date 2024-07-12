package com.practical.practicewebwithh2.controller;

import com.practical.practicewebwithh2.model.Product;
import com.practical.practicewebwithh2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping ("getProduct")
    public List<Product> getProduct(){
        return productService.getProduct();
    }

    @GetMapping("getByCusip")
    public  List<Product> getProductByCusip(@RequestParam("cusip") String cusip){
        return productService.getProductByCusip(cusip);
    }

    @GetMapping("getByCusip/{cusip}")
    public  List<Product> getProductByCusipPath(@PathVariable("cusip") String cusip){
        return productService.getProductByCusip(cusip);
    }

    @PostMapping("addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

}
