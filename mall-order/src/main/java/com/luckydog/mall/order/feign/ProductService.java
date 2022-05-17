package com.luckydog.mall.order.feign;

import com.luckydog.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：LuckyDog
 * @description：TODO
 * @date ：2022/5/16 22:23
 */

@FeignClient(name = "mall-product")
public interface ProductService {

    /**
     * 需要访问的远程方法
     * @return
     */
    @GetMapping("/product/brand/all")
    public R queryAllBrand();
}