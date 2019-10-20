package com.order.feign;

import bean.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("PRODUCT")
public interface ProductFeignClient {

    @GetMapping("/product/info/{productId}")
    Product getProductById(@PathVariable("productId") int productId);
}
