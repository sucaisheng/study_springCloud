package com.sucaisheng.service.impl;

import com.sucaisheng.dao.ProductDao;
import com.sucaisheng.entity.Product;
import com.sucaisheng.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findProductById(Long id) {
        return productDao.findById(id).get();
    }

    @Override
    public void saveProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        productDao.deleteById(id);
    }
}
