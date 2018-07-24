package com.java1234.controller;

import com.java1234.domain.inter.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    DBConnector connector;

    @RequestMapping(value={"/",""})
    public String helloTask(){
        connector.configure();  //由于配置文件指定的profile为testdb，故打印test
        return "hello task!! myage is 21";
    }
}
