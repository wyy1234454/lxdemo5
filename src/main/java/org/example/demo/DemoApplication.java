package org.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.demo.mapper")
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("------DemoApplication  start-------");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("------DemoApplication  end-------");
    }
} 