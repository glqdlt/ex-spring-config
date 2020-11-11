package com.glqdlt.ex.annoationworks.attribute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;

@Configuration
public class AnnotationsConfigAttribute implements ImportAware {

    private String name;

    @Bean
    AnnotationWorkInnerBeanAttribute annotationWorkInnerBeanName() {
        return new AnnotationWorkInnerBeanAttribute(name);
    }

    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        MultiValueMap<String, Object> aa = importMetadata.getAllAnnotationAttributes(EnableMyConfigurationAttribute.class.getName());
        List<Object> nameValue = aa.get("name");
        name = nameValue.get(0).toString();
    }
}
