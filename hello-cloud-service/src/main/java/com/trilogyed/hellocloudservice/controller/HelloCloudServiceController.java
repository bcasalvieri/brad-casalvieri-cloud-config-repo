package com.trilogyed.hellocloudservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloCloudServiceController {
    @Value("${officialGreeting}")
    private String officialGreeting;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String helloCloud() {

        return officialGreeting;
    }
}
