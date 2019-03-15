package com.breaker93.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-test1", fallback = Test1ServiceHystrix.class)
public interface Test1Service {
    @GetMapping(value = "/hi")
    public String visitHi(@RequestParam(value = "name") String name);
}
