package com.loadbalancing.example.LoadBalancingServer;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {

    @Autowired
    IClientConfig ribbionClient;

    @Bean
    public IPing ping (IClientConfig ribbionClient)
    {
        return new PingUrl();
    }

    public IRule rule(IClientConfig ribbionClient)
    {
        return new AvailabilityFilteringRule();
    }
}
