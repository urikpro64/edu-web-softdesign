package com.solfwaredesign.projectedu.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product/{id}")
    public ProductResponse getProductById(@PathVariable int id){
        ProductResponse productResponse = new ProductResponse(id, "Namjai", 70, "27/10/2022");
        return  productResponse;
    }
}