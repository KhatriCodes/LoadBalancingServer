package com.loadbalancing.example.LoadBalancingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name="LoadBalancingClient", configuration = RibbonConfiguration.class)
public class LoadBalancingServerApplication {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate()
	{
		return  new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancingServerApplication.class, args);
	}

}
