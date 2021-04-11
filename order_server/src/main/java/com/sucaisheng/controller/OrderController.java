package com.sucaisheng.controller;

import com.sucaisheng.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable Long id){
        Product product = null;
        product = restTemplate.getForObject("http://service-product/product/" + id, Product.class);
        return product;
    }

//    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
//    public Product getProductById(@PathVariable Long id){
//        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
//        ServiceInstance serviceInstance = instances.get(0);
//        Product product = null;
//        product = restTemplate.getForObject("http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/product/" + id, Product.class);
//        return product;
//    }
}
