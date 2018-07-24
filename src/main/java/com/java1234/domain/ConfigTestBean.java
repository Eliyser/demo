package com.java1234.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<bean>
@Configuration
@ConfigurationProperties(prefix="com.md")
//默认在application.properties中读取，这里指明到test.properties中去读
@PropertySource("classpath:test.properties")
public class ConfigTestBean {
    private String name;
    private String want;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWant() {
        return want;
    }
    public void setWant(String want) {
        this.want = want;
    }
}
