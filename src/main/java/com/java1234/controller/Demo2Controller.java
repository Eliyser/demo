package com.java1234.controller;

import com.java1234.domain.Demo;
import com.java1234.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
    @Resource
    private DemoService demoService;

    /* 测试添加数据方法 */
    @RequestMapping("/save")
    public String save(){
        Demo d=new Demo();
        d.setName("Angle");
        demoService.save(d);
        return "ok.Demo2Controller.save";
    }
}
