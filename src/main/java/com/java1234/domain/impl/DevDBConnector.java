package com.java1234.domain.impl;

import com.java1234.domain.inter.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 开发数据库
 */
@Component
@Profile("devdb")
public class DevDBConnector implements DBConnector {
    @Override
    public void configure(){
        System.out.println("devdb");
    }
}
