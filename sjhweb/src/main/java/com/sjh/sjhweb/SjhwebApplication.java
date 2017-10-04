package com.sjh.sjhweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.sjh.sjhweb.entity.map" }, sqlSessionFactoryRef = "sqlSessionFactory")
@ServletComponentScan
public class SjhwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SjhwebApplication.class, args);
	}
}
