package com.putao.es0.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 且注意扫描包
 * 我在这里加多个扫描包，主要为了引用包（client2-api与当前项目包不在一个包下）
 * spring默认就近原则扫描，即为：@SpringBootApplication类下的包开始扫描
 * @Author: zenghao
 */
@SpringBootApplication
public class ZipkinClientApplication0 {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication0.class, args);
    }
}
