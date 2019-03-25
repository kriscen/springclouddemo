package com.kris.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//EurekaServer服务端启动类，接受其他微服务注册进来
public class EurekaServer7001App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001App.class,args);
    }
}
