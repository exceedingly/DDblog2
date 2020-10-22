package com.mcd;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.mcd.mapper")
@ComponentScan("com.mcd.service.impl")
@ComponentScan("com.mcd.service")

@SpringBootApplication
public class Ddblog2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ddblog2Application.class, args);
    }

}
