package com.java1234.service;

import com.java1234.dao.inter.DemoRepository;
import com.java1234.domain.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;

    @Transactional
    public void save(Demo demo){
        //save相当于add
        demoRepository.save(demo);
    }
}
