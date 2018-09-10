package com.study.full.stack.fullstack_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan(basePackages = "com.study.full.stack.fullstack_project.service")
public class FullstackProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackProjectApplication.class, args);
	}







}
