package com.boomdev.springcloudconfigserver.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="server")
public class BeanConfig {

    //@Value("${port}")
    private String port = "";

    public void print(){
        System.out.println("Configuracion del puerto : " + port);
    }
}
