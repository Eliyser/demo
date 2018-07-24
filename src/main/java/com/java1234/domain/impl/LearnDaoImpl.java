package com.java1234.domain.impl;

import com.java1234.domain.LearnResource;
import com.java1234.domain.inter.LearnDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LearnDaoImpl implements LearnDao {
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(LearnResource learnResource){
        return jdbcTemplate.update("insert into learn_resource(name,address) value(?,?)",learnResource.getName(),learnResource.getAddress());
    }

    @Override
    public int update(LearnResource learnResource){
        return jdbcTemplate.update("update learn_resource set name=?,address=? where id=?",new Object[]{learnResource.getName(),learnResource.getAddress(),learnResource.getId()});
    }

    @Override
    public int deleteByIds(String ids){
        return jdbcTemplate.update("delete from learn_resource where id in("+ids+")");
    }

    @Override
    public LearnResource queryLearnResourceById(long id){
        //BeanPropertyRowMapper：通过名称匹配的方式，映射到类的属性中去，如果某个属性不匹配则返回属性值为null
        //属性名userName可以匹配数据库中的字段USERNAME或user_name；我们就不需要一个一个手动绑定了，大大提高了开发效率
        List<LearnResource> list= jdbcTemplate.query("select * from learn_resource where id=?",new BeanPropertyRowMapper<LearnResource>(LearnResource.class));
        if(null!=list&&list.size()>0){
            LearnResource learnResource=list.get(0);
            return learnResource;
        }else{
            return null;
        }
    }
}
