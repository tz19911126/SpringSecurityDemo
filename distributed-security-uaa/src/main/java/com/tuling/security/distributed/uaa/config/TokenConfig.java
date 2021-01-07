package com.tuling.security.distributed.uaa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * 令牌是怎么存放的
 */
@Configuration
public class TokenConfig {
    @Bean
    public TokenStore tokenStore() {
        //使用基于内存的普通令牌
        return new InMemoryTokenStore();
    }
}
