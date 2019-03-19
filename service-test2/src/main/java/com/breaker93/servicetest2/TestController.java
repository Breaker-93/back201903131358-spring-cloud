package com.breaker93.servicetest2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${foo}")
    private String foo;

    @GetMapping("/hi")
    public String hi() {
        return foo;
    }
}
