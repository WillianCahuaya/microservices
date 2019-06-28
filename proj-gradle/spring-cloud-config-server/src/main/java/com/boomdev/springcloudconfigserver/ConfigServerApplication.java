package com.boomdev.springcloudconfigserver;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigServer
@ComponentScan({"com.boomdev"})
public class ConfigServerApplication {
}
