package com.solfwaredesign.projectedu.controller;

import com.solfwaredesign.projectedu.models.Product;
import com.solfwaredesign.projectedu.repository.ProductRepository;
import com.solfwaredesign.projectedu.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController extends SequenceGeneratorService {
    @Autowired
    ProductRepository productRepository;

    public ProductController(MongoOperations mongoOperations) {
        super(mongoOperations);
    }

    @GetMapping("/products/all")
    public List<Product> getAllProduct(){
        List<Product> products = productRepository.findAll();
        return products;
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable long id){
        Optional<Product> optionalProduct= productRepository.findById(id);
        System.out.println(optionalProduct);
        return optionalProduct.isPresent() ? optionalProduct.get() : null;
    }

    @PostMapping("/products/add")
    @ResponseBody
    public Product createProduct(@RequestBody Product product){
        product.setId(generateSequence(Product.SEQUENCE_NAME));
        System.out.println(product);
        return productRepository.save(product);
    }

    @GetMapping ("/products/deleteAll")
    public void deleteAllProduct(){
        try {
            productRepository.deleteAll();
            return;
        }
        catch (Exception e){

        }
    }
        
}