package com.glqdlt.ex.annoationworks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationsConfig {

    @Bean
    public AnnotationWorkInnerBean annotationWorkInnerBean() {
        return new AnnotationWorkInnerBean();
    }

}
