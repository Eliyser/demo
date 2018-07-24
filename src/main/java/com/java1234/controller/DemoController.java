package com.java1234.controller;

import com.java1234.domain.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angle");
        Demo demo1 = new Demo();
        demo1.setId(2);
        demo1.setName("Angle2");
        return demo;
    }
}
