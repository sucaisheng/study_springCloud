package com.sucaisheng.feign;

import com.sucaisheng.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 配置接口
 * @FeignClient 提供服务的名字
 */
@FeignClient(name = "service-product")
public interface ProductFeign {

    /**
     * 配置需要请求的接口的路径
     * @param id
     * @return
     */
    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable("id") Long id);
}
