package com.java1234.dao.inter;

import com.java1234.domain.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author haien
 * @Description 这是一个接口，也不会有具体的实现类，这就是jpa
 * @Date 10:19 2018/7/24
 * @Param
 * @return
 **/
//在CrudRepository自带常用的crud方法，类似的接口还有PagingAndSortingRepository/SimpleJpaRepository/QueryDsUpaRepository
public interface DemoRepository extends CrudRepository<Demo,Long> {
    //没有内容，这样一个基本的dao就写完了，拥有增删查改方法了
}
