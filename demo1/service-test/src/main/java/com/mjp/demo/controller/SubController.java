package com.mjp.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HAHAHA on 2017/7/5.
 */
@RestController
@RequestMapping("/sub")
public class SubController {

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        System.out.println("此时为服务器2");
        Integer r = a + b;
        return r;
    }

}
