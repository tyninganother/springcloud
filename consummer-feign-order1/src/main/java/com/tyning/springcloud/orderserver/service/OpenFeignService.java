package com.tyning.springcloud.orderserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author haining
 */
//需要添加这个@Component注解可以被扫描到
@Component
//这里填写微服务名字
@FeignClient(value = "PAYMENT-SERVER")
public interface OpenFeignService {

    @GetMapping(value = "/pay/get")
    String getPayById(String id);
}
