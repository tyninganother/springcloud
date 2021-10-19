package com.tyning.springcloud.orderserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class HystrixOrderServer9002Application {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrderServer9002Application.class, args);
    }
}
