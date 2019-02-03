package com.config_demo.soa_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${from}")
    public String from;

    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String from(){
        return this.from;
    }
}
