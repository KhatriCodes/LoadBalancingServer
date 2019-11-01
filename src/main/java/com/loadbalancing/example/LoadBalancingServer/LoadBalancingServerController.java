package com.loadbalancing.example.LoadBalancingServer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoadBalancingServerController {

@Autowired
    RestTemplate restTemplate;

    @RequestMapping("/invoke")
    public String invokeLoadBalancingClient()
    {
        String url = "http://LoadBalancingClient/client";
        return restTemplate.getForObject(url,String.class);
    }
}
