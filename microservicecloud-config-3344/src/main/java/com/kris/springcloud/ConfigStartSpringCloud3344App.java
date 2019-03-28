package com.kris.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigStartSpringCloud3344App {

    public static void main(String[] args) {
        SpringApplication.run(ConfigStartSpringCloud3344App.class,args);
    }
}
