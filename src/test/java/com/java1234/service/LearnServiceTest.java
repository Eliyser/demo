package com.java1234.service;

import com.java1234.domain.LearnResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author haien
 * @Description 测试类，想要执行，鼠标放在方法上右键run即可
 * @Date 17:40 2018/7/20
 * @Param
 * @return
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnServiceTest {
    @Autowired
    private LearnResource learnResource;

    @Test
    public void getLearn(){
        /*
        //对查询方法进行测试  PS：LearnService类没有在本项目中实现
        LearnResource learnSource=LearnService.selectByKey(1001L);
        //推荐使用assertThat断言
        Assert.assertThat(learnResource.getName(),is("嘟嘟独立博客-Spring Boot干货系列"));
        */
    }

}