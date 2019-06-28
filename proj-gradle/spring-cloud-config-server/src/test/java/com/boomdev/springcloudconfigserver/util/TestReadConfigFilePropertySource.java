package com.boomdev.springcloudconfigserver.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@RunWith(.class)
@SpringBootTest
public class TestReadConfigFilePropertySource {

    @Autowired
    private ReadConfigFilePropertySource beanConfig;

    @BeforeEach
    public void init(){
        System.out.println("Init test");
    }

    @Test
    public void testBean(){
        beanConfig.print();
    }

    @AfterEach
    public void end(){
        System.out.println("End test");
    }
}
