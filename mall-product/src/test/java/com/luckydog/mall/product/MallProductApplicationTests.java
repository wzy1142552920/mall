package com.luckydog.mall.product;

import com.luckydog.mall.product.entity.BrandEntity;
import com.luckydog.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        BrandEntity entity = new BrandEntity();
        entity.setName("huawei");
        brandService.save(entity);
    }

}
