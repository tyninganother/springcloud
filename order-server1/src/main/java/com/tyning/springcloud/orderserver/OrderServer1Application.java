package com.tyning.springcloud.orderserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(OrderServer1Application.class, args);
    }
}