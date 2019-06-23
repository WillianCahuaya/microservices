package com.boomdev.springcloudconfigserver.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix="server")
public class ReadConfigFilePropertySource {

    private static final String BASE = "Config Application: ";

    @Value("${port}")
    private String port;

    @Value("${context-path}")
    private String contextPath;

    public void print(){
        System.out.println(BASE + "port : " + port);
        System.out.println(BASE + "port : " + contextPath);
    }
}
