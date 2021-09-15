package com.example.client.client;

import com.example.client.web.interceptor.FeignInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "message-service",
        url = "${feign.message-service.url}", configuration = FeignInterceptor.class)
public interface MessageClient {
  @GetMapping("/api/message")
  String getMessage();
}
