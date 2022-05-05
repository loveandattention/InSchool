package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Ma Tengfei
 * @create 2022-05-05 16:30
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
