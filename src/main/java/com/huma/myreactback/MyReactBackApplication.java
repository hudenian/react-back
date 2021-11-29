package com.huma.myreactback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.huma.myreactback.mapper"})
public class MyReactBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyReactBackApplication.class, args);
    }

}
