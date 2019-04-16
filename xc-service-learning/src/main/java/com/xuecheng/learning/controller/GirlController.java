package com.xuecheng.learning.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cmy
 * @Date: 2019/4/12 11:16
 * @Description:
 */
@RestController
@RequestMapping
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @RequestMapping("/girl")
    public String girl(){
        System.out.println(JSON.toJSONString(girlConfig));
        return JSON.toJSONString(girlConfig);
    }
}
