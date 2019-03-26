package com.kris.springcloud;

import com.kris.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//特殊化定义rule，不能放在主启动类包及子包内
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class DeptConsumer80App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class,args);

    }
}
