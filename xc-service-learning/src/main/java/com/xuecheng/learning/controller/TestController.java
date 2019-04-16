package com.xuecheng.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cmy
 * @Date: 2019/4/12 10:21
 * @Description:
 */
@RequestMapping
@RestController
@RefreshScope
public class TestController {

    @Value("${env.test}")
    private String env;



    @RequestMapping("env")
    public String env(){
        return env;
    }
}
