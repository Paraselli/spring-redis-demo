package com.example.demo.config;

import org.springframework.context.annotation.*;
import org.springframework.data.redis.cache.*;
import java.time.Duration;

@Configuration
public class RedisConfig {

    @Bean
    public RedisCacheConfiguration cacheConfig() {
        return RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofMinutes(5));
    }
}
