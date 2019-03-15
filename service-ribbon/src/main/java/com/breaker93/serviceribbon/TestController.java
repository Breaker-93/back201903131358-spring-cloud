package com.breaker93.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String visitServiceTest1Hi(@RequestParam String name) {
        return restTemplate.getForObject("http://SERVICE-TEST1/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return name + ",sorry,error!";
    }

}
