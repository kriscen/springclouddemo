package com.kris.springcloud.controller;

import com.kris.springcloud.entities.Dept;
import com.kris.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept" ,method = RequestMethod.POST)
    public boolean add(Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/{id}" , method = RequestMethod.GET)
    public Dept get(@PathVariable("id")Long id){
        Dept dept = deptService.get(id);
        return dept;
    }
    @RequestMapping(value = "/depts" , method = RequestMethod.GET)
    public List<Dept> list(){
        List<Dept> t = deptService.list();
        return t;
    }

}
