package com.atguigu.jubaopen.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.jubaopen.manage.mapper")
public class JubaopenManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JubaopenManageServiceApplication.class, args);
	}
}
