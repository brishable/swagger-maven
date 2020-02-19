package com.broadcom.swaggermaven.controller;

import com.broadcom.swaggermaven.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/")
    public String homePage(){
        return "Home Page";
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return Arrays.asList(new Product(1,"Medical","medical Product"),
                new Product(2,"Sanitary","sanitary product"));
    }
}
