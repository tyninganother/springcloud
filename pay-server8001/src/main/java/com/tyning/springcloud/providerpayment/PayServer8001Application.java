package com.tyning.springcloud.providerpayment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayServer8001Application {
    public static void main(String[] args) {
        SpringApplication.run(ZkPayServer8004Application.class, args);
    }
}
