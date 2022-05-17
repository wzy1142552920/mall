package com.luckydog.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.luckydog.mall.order.feign")
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.luckydog.mall.order.dao")
public class MallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallOrderApplication.class, args);
    }
}
