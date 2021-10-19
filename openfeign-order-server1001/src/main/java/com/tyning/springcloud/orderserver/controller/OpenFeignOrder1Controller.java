package com.tyning.springcloud.orderserver.controller;

import com.tyning.springcloud.orderserver.service.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author haining
 */
@Controller
@RequestMapping("/order")
public class OpenFeignOrder1Controller {

    @Value(value = "${server.port}")
    private String serverPort;

    @Autowired
    private OpenFeignService openFeignService;

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        return openFeignService.getPayById("2");
    }


}
