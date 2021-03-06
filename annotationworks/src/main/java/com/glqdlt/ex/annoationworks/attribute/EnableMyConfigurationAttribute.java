package com.glqdlt.ex.annoationworks.attribute;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AnnotationsConfigAttribute.class)
public @interface EnableMyConfigurationAttribute {
    String name() default "annotations";
}
