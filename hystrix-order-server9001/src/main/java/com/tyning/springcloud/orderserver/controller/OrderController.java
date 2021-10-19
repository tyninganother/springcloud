package com.tyning.springcloud.orderserver.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

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
        return "order.port=" + serverPort + "responseBody=" + restTemplate.getForObject(PAYMENT_URL + "/pay/get", String.class);
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/discovery")
    @ResponseBody
    public JSONObject discovery() {
        JSONObject resultJson = new JSONObject();
        List<String> list = new ArrayList();
        //获取在注册中心中的微服务对象
        List<String> serverList = discoveryClient.getServices();
        for (String instanceId : serverList) {
            List<ServiceInstance> discoveryClientInstances = discoveryClient.getInstances(instanceId);
            for (ServiceInstance serviceInstance : discoveryClientInstances) {
                list.add(serviceInstance.getHost()+"|"+serviceInstance.getPort()+"|"+serviceInstance.getInstanceId()+"|"+serviceInstance.getServiceId());
            }
        }
        resultJson.put("serverList", serverList);
        resultJson.put("list", list);
        return resultJson;
    }
}
