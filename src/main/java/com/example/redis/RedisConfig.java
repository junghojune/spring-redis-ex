package com.example.redis;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.data.redis.connection.RedisConnectionFactory;import org.springframework.data.redis.core.RedisTemplate;import org.springframework.data.redis.serializer.RedisSerializer;@Configurationpublic class RedisConfig {    @Bean    public RedisTemplate<String, ItemDto> itemRedisTemplate(RedisConnectionFactory redisConnectionFactory) {        RedisTemplate<String, ItemDto> redisTemplate = new RedisTemplate<>();        // 커넥션 방        redisTemplate.setConnectionFactory(redisConnectionFactory);        // key 직렬화 방법        redisTemplate.setKeySerializer(RedisSerializer.string());        // value 직렬화 방법        redisTemplate.setValueSerializer(RedisSerializer.json());        return redisTemplate;    }}