package com.broadcom.swaggermaven.controller;

import com.broadcom.swaggermaven.model.Product;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/")
    public String homePage() {
        return "Home Page";
    }

    @ApiOperation(value = "Finds all the products",
            notes = "This fetches all the products in the repository and returns as a list",
            response = Product.class,
            responseContainer = "List")
    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(new Product(1, "Medical", "medical Product"),
                new Product(2, "Sanitary", "sanitary product"));
    }
}
