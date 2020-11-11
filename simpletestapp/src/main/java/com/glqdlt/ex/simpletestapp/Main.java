package com.glqdlt.ex.simpletestapp;

import com.glqdlt.ex.annoationworks.simple.AnnotationWorkInnerBean;
import com.glqdlt.ex.annoationworks.attribute.AnnotationWorkInnerBeanAttribute;
import com.glqdlt.ex.annoationworks.simple.EnableMyConfiguration;
import com.glqdlt.ex.annoationworks.attribute.EnableMyConfigurationAttribute;
import com.glqdlt.ex.autoconfiguration.MySImpleAutoConfigInnerBaen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableMyConfiguration
@EnableMyConfigurationAttribute(name = "hello")
@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private MySImpleAutoConfigInnerBaen mySimpleBean;

    @Autowired
    private AnnotationWorkInnerBean annotationWorkInnerBean;

    @Autowired
    private AnnotationWorkInnerBeanAttribute annotationWorkInnerBeanName;

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(mySimpleBean.echo());
        logger.info(annotationWorkInnerBean.echo());
        logger.info(annotationWorkInnerBeanName.echo());
    }
}
