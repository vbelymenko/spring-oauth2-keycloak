package com.example.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class WebSecurity {
  @Bean
  SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
    http
            .authorizeExchange()
            .pathMatchers("/message-service/api/v1/message").hasAuthority("SCOPE_email")
            .pathMatchers("/message-service/api/v2/message").hasAuthority("SCOPE_password")
            .pathMatchers("/message-service/api/v3/message").permitAll()
            .anyExchange().authenticated()
            .and()
            .oauth2ResourceServer()
            .jwt();
    return http.build();
  }
}
