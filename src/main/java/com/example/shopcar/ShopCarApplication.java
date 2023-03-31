package com.example.shopcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ShopCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCarApplication.class, args);
    }

}
