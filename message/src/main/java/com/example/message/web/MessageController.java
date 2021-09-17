package com.example.message.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

  @GetMapping("/v1/message")
  public ResponseEntity<String> call() {
    return ResponseEntity.ok("Version №1");
  }

  @GetMapping("/v2/message")
  public ResponseEntity<String> call1() {
    return ResponseEntity.ok("Version №2");
  }

  @GetMapping("/v3/message")
  public ResponseEntity<String> call2() {
    return ResponseEntity.ok("Version №3");
  }
}
