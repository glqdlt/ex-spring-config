package com.glqdlt.ex.autoconfiguration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySimpleAutoConfig {

    @Bean
    MySImpleAutoConfigInnerBaen mySimpleBean() {
        return new MySImpleAutoConfigInnerBaen();
    }
}
