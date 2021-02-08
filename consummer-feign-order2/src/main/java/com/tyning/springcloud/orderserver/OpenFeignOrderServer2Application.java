package com.tyning.springcloud.orderserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignOrderServer2Application {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignOrderServer2Application.class, args);
    }
}
