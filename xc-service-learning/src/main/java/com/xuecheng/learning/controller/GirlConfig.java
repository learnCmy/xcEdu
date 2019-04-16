package com.xuecheng.learning.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Auther: cmy
 * @Date: 2019/4/12 11:14
 * @Description:
 */
@Component
@Data
@RefreshScope
@ConfigurationProperties("girl")
public class GirlConfig {

    private String name;

    private Integer age;
}
