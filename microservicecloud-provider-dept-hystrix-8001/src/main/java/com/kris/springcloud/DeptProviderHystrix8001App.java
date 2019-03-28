package com.kris.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//自动注册eureka服务
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//熔断器
public class DeptProviderHystrix8001App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001App.class,args);
    }
}
