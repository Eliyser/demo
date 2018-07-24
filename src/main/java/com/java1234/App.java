package com.java1234;

import com.alibaba.druid.pool.DruidDataSource;
import com.java1234.domain.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;


@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class}) //允许自动配置属性，被配置的类为ConfigBean
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    //Environment这个类是用来加载application.properties文件中的属性的
    @Autowired
    private Environment env;

    /**
     * @Author haien
     * @Description 在数据库操作层写：
     *              注解：@Autowired
     *              private JdbcTemplate jdbcTemplate;
     *              SpringBoot会自动应用下面的数据库连接池
     *              只在这里设置连接池的属性或者配置文件那里写就好了，应该不用两边都写的
     * @Date 11:25 2018/7/20
     * @Param []
     * @return javax.sql.DataSource
     **/
    //数据库连接池的配置，只是ddl的话可以不写，在配置文件那边写就够了
    //destroyMethod = "close"的作用是当数据库连接不使用时，就把该连接重新放入数据池中，方便下次使用

    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名
        dataSource.setPassword(env.getProperty("spring.datasource.password"));//用户密码
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setInitialSize(2);//初始化时建立物理连接的个数
        dataSource.setMaxActive(20);//最大连接池数量
        dataSource.setMinIdle(0);//最小连接池数量
        dataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒
        dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql，要求是一个查询语句
        dataSource.setTestOnBorrow(false);//申请连接时执行ValidationQuery检测连接是否有效，建议为false，因为做了这个配置会降低性能；若上面那行括号为null则这一行怎么写都不生效
        dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能且保证安全性；作用是在ValidationQuery上加个条件：当空闲时间大于timeBetweenEvictionRunsMillis时才执行连接检测
        dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement
        return dataSource;
    }

}
