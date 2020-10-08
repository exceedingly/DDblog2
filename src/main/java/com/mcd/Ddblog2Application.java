package com.mcd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//去这个位置 找到自己生成的xml
@MapperScan(basePackages = {"com.mcd.mapper"})
@SpringBootApplication
public class Ddblog2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ddblog2Application.class, args);
    }

}
