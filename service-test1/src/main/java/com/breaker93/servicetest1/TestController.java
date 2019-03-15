package com.breaker93.servicetest1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "breaker") String name) {
        return "Hello," + name + "! I'm from port:" + port;
    }
}
