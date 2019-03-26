package com.kris.springcloud.controller;

import com.kris.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001";.
    //修改成通过微服务名获得
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    //(请求地址，请求参数，返回对象)

    @RequestMapping(value = "/consumer/dept" , method = RequestMethod.POST)
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/{id}" , method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/depts" , method = RequestMethod.GET)
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/depts",List.class);
    }
}

