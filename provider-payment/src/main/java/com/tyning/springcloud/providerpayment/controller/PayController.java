package com.tyning.springcloud.providerpayment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pay")
public class PayController {
    @Value(value = "${server.port}")
    private String serverPort;

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        return "pay.port=" + serverPort;
    }
}
