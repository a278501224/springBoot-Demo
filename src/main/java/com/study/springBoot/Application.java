package com.study.springBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.study")
@MapperScan(basePackages="com.study.mapper")
//@EnableCaching //开启缓存功能
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

