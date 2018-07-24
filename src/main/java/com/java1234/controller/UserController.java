package com.java1234.controller;

import com.java1234.domain.ConfigTestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   private Logger logger=LoggerFactory.getLogger(this.getClass());

    /*
    //绑定属性配置
    @Value("${com.dudu.name}")
    private String name;
    @Value("${com.dudu.want}")
    private String want;

    @RequestMapping("/")
    public String hexo(){
        return name+","+want;
    }*/

    /*//绑定bean配置
    @Autowired  //注入bean
    ConfigBean configBean;

    @RequestMapping("/")
    public String hexo(){
        return configBean.getYearhope();
    }*/

    //使用自定义配置文件
    @Autowired  //和@Resource一样用于注入bean,也就是说有一个bean已经装配好了，拿来这里注入；装配的方法可以是用@Configuration+@Bean注解
    ConfigTestBean configTestBean;

    @RequestMapping("/hexo")
    public String hexo(){
        //设置每种级别的输出内容，由于logback-spring.xml中，root将级别设置为info，所以访问hexo后只会打印后面三种级别的日志
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        
        return configTestBean.getName()+configTestBean.getWant();
    }
}
