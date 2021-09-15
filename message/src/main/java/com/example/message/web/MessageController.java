package com.example.message.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  @GetMapping("/api/message")
  public ResponseEntity<String> call() {
    return ResponseEntity.ok("It works!!!");
  }
}
