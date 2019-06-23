package com.boomdev.springcloudconfigserver;

import com.boomdev.springcloudconfigserver.util.BeanConfig;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ConfigServerApplication.class})
//@SpringBootTest
@ComponentScan({"com.boomdev",
        "com.boomdev.springcloudconfigserver",
        "com.boomdev.springcloudconfigserver.util"})
public class TestBeanConfig {

    @Autowired
    private BeanConfig beanConfig;

    @Test
    public void testBean(){
        System.out.println("hola a todoos");
        beanConfig.print();
        System.out.println("hola a todos final");
    }
}
