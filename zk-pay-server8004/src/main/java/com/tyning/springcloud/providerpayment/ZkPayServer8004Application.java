package com.tyning.springcloud.providerpayment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkPayServer8004Application {
    public static void main(String[] args) {
        SpringApplication.run(ZkPayServer8004Application.class, args);
    }
}
