package com.tyning.springcloud.orderserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Value(value = "${server.port}")
    private String serverPort;
    static final private String PAYMENT_URL = "http://PAYMENT-SERVER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        return "order.port=" + serverPort + "responseBody=" + restTemplate.getForObject(PAYMENT_URL+"/pay/get", String.class);
    }
}
