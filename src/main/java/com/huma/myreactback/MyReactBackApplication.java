package com.huma.myreactback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.huma.myreactback.mapper"})
public class MyReactBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyReactBackApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowCredentials(true).allowedOriginPatterns("*").allowedMethods("*");
            }
        };
    }

}
