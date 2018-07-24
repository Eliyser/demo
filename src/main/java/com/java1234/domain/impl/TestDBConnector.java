package com.java1234.domain.impl;

import com.java1234.domain.inter.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 测试数据库
 */
@Component
@Profile("testdb")
public class TestDBConnector implements DBConnector {
    @Override
    public void configure(){
        System.out.println("testdb");
    }
}
