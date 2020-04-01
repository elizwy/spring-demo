package com.zwy.springdemo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {
    @NacosValue("${mysql.password}")
    private String password;

    @Value("${jdbc.optimus.master.url}")
    private String mysqlUrl;

    @Value("${test.name}")
    private String name;


    @GetMapping(value = "/getPassword")
    public String getPassword() {
        return password;
    }

    @GetMapping(value = "/getUrl")
    private String getMySqlUrl(){
        return mysqlUrl;
    }

    @GetMapping(value = "/getName")
    public String getName(){
        return name;
    }
}
