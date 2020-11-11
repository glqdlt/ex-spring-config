package com.glqdlt.ex.annoationworks.attribute;

public class AnnotationWorkInnerBeanAttribute {
    private final String name;

    public AnnotationWorkInnerBeanAttribute(String name) {
        this.name = name;
    }

    public String echo() {
        return name + " Annotations Works Loaded!";
    }

}
