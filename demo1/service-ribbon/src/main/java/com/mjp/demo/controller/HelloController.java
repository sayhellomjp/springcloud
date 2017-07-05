package com.mjp.demo.controller;

import com.mjp.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HAHAHA on 2017/7/5.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/add")
    public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return helloService.hello(a, b);
    }

}
