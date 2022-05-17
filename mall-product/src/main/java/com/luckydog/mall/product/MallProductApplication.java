package com.luckydog.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：LuckyDog
 * @description：TODO
 * @date ：2022/5/15 16:09
 */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.luckydog.mall.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
