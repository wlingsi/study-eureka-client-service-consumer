package com.william.study.serviceconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("a-bootiful-client")
public interface GreetingClient {

    @GetMapping("/greeting")
    public String greeting();
}
