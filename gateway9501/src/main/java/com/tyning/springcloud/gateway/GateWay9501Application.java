package com.tyning.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateWay9501Application {
    public static void main(String[] args) {
        SpringApplication.run(GateWay9501Application.class, args);
    }
}
