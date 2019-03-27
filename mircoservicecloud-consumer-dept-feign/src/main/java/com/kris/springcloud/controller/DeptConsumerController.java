package com.kris.springcloud.controller;

import com.kris.springcloud.entities.Dept;
import com.kris.springcloud.service.DeptClientService;
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
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/depts" , method = RequestMethod.GET)
    public List<Dept> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept" ,method = RequestMethod.POST)
    public Object add(Dept dept) {
        return this.service.add(dept);
    }
}

