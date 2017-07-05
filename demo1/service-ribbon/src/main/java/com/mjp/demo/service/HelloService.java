package com.mjp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HAHAHA on 2017/7/5.
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(Integer a, Integer b) {
        int result = restTemplate.getForObject("http://SERVICE-TEST/sub/add?a=" + a + "&b=" + b, Integer.class);
        String resultStr = "计算结果为:" + a + "+" + b + "=" + result;
        System.out.println(resultStr);
        return resultStr;
    }

}
