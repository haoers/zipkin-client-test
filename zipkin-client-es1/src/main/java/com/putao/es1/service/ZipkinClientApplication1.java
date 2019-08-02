package com.putao.es1.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 且注意扫描包
 * 我在这里加多个扫描包，主要为了引用包（client2-api与当前项目包不在一个包下）
 * spring默认就近原则扫描，即为：@SpringBootApplication类下的包开始扫描
 * @Author: zenghao
 */
@SpringBootApplication(scanBasePackages = {"com.putao.es2.api.client", "com.putao.es1.service"})
@EnableFeignClients(basePackages = {"com.putao.es2.api.client","com.putao.es0.api.client"})
public class ZipkinClientApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication1.class, args);
    }
}
