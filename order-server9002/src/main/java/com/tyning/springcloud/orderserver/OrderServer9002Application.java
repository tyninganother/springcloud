package com.tyning.springcloud.orderserver;


import com.tyning.springcloud.ribbonrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//这里指定当前工程调用哪一个服务、使用哪一个类定义的负载均衡规则
@RibbonClient(name = "PAYMENT-SERVER", configuration = MyRule.class)
public class OrderServer9002Application {
    public static void main(String[] args) {
        SpringApplication.run(OrderServer9002Application.class, args);
    }
}
