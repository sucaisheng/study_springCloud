package com.sucaisheng.controller;

import com.sucaisheng.entity.Product;
import com.sucaisheng.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable Long id){
        return productService.findProductById(id);
    }
}
