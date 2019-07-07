package com.wzq.datasource2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.wzq.datasource2")
public class Datasource2Application {
    public static void main(String[] args) {
        SpringApplication.run(Datasource2Application.class, args);
    }

}
