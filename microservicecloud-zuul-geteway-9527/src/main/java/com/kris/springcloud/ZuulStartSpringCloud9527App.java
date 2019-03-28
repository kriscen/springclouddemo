package com.kris.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulStartSpringCloud9527App {
    public static void main(String[] args) {
        SpringApplication.run(ZuulStartSpringCloud9527App.class,args);
    }
}
