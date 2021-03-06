package com.breaker93.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    Test1Service test1Service;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return test1Service.visitHi(name);
    }
}
