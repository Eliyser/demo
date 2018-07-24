package com.java1234.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

//指明使用哪个bean注入
@ConfigurationProperties(prefix="com.dudu")  //表明.properties里配置常量的前缀为com.dudu
public class ConfigBean {
    private String name;
    private String want;
    private String yearhope;

    public String getYearhope() {
        return yearhope;
    }
    public void setYearhope(String yearhope) {
        this.yearhope = yearhope;
    }
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
