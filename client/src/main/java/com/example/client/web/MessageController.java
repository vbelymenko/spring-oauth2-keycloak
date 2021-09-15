package com.example.client.web;

import com.example.client.client.MessageClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
  private final MessageClient messageClient;

  @GetMapping("/api/message")
  public ResponseEntity<String> getMessage() {
    return ResponseEntity.ok(messageClient.getMessage());
  }

}

