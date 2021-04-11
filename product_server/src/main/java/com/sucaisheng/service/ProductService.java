package com.sucaisheng.service;

import com.sucaisheng.entity.Product;

import java.util.List;

public interface ProductService {
    /**
     * 根据id获取商品
     * @param id
     * @return
     */
    public Product findProductById(Long id);

    /**
     * 保存商品
     * @param product
     */
    public void saveProduct(Product product);

    /**
     * 更新商品信息
     * @param product
     */
    public void updateProduct(Product product);

    /**
     * 获取所有商品列表
     * @return
     */
    public List<Product> findAllProduct();

    /**
     * 根据id删除商品
     * @param id
     */
    public void deleteProduct(Long id);
}
