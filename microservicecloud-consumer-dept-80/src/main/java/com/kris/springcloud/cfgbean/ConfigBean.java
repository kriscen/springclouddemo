package com.kris.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    //客户端负载均衡工具
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    @Bean
    public IRule myRule(){
        //使用指定算法替换默认轮询
        return new RandomRule();
    }
}
