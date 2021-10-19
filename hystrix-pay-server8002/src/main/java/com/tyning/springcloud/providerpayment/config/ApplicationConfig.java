package com.tyning.springcloud.providerpayment.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ApplicationConfig {

    /**
     *
     * @LoadBalanced 是添加负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("heihaozi", 1);
        Integer i = map != null ? map.get("a") : Integer.MAX_VALUE;
        System.out.println(i);
    }
}
