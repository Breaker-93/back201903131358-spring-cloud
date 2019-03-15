package com.breaker93.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class Test1ServiceHystrix implements Test1Service {
    @Override
    public String visitHi(String name) {
        return name + ",sorry error! (from feign tip)";
    }
}
