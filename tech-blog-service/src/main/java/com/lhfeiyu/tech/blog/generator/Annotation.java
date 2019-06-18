package com.lhfeiyu.tech.blog.generator;

public enum Annotation {
    DATA("@Data", "lombok.Data"),
    Mapper("@Mapper", "org.apache.ibatis.annotations.Mapper"),
    Param("@Param", "org.apache.ibatis.annotations.Param"),
    ApiModel("@ApiModel", "io.swagger.annotations.ApiModel"),
    ApiModelProperty("@ApiModelProperty", "io.swagger.annotations.ApiModelProperty"),
    JsonFormat("@JsonFormat", "com.fasterxml.jackson.annotation.JsonFormat"),
    Component("@Component", "org.springframework.stereotype.Component");

    private String annotation;

    private String clazz;

    Annotation(String annotation, String clazz) {
        this.annotation = annotation;
        this.clazz = clazz;
    }

    public String getAnnotation() {
        return annotation;
    }

    public String getClazz() {
        return clazz;
    }
}