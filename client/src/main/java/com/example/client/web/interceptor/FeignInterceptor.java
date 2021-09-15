package com.example.client.web.interceptor;

import com.example.client.provider.OAuth2Provider;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FeignInterceptor implements RequestInterceptor {
  private static final String AUTHORIZATION_HEADER = "Authorization";
  private final OAuth2Provider provider;

  @Override
  public void apply(RequestTemplate requestTemplate) {
    requestTemplate.header(AUTHORIZATION_HEADER, provider.getAuthenticationToken());
  }

}
