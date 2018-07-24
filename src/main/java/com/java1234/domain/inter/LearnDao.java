package com.java1234.domain.inter;

import com.java1234.domain.LearnResource;

/**
 * @Author haien
 * @Description 增删查改
 * @Date 11:33 2018/7/20
 * @Param
 * @return
 **/
public interface LearnDao {
    int add(LearnResource learnResource);
    int update(LearnResource learnResource);
    int deleteByIds(String ids);
    LearnResource queryLearnResourceById(long id);
}
