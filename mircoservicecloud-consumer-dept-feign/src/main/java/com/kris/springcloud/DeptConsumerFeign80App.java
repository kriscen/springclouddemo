package com.kris.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kris.springcloud"})
@ComponentScan("com.kris.springcloud")
public class DeptConsumerFeign80App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign80App.class,args);

    }
}
