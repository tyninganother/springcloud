package com.tyning.springcloud.providerpayment.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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
                list.add(serviceInstance.getHost() + "|" + serviceInstance.getPort() + "|" + serviceInstance.getInstanceId() + "|" + serviceInstance.getServiceId());
            }
        }
        resultJson.put("serverList", serverList);
        resultJson.put("list", list);
        return resultJson;
    }
}
