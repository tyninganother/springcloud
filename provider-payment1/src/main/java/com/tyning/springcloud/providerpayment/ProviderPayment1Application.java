package com.tyning.springcloud.providerpayment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderPayment1Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment1Application.class, args);
    }
}