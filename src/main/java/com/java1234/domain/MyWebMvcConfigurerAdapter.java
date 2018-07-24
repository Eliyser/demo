package com.java1234.domain;

import com.java1234.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

    /**
     * @Author haien
     * @Description 配置静态访问资源
     * @Date 14:05 2018/7/18
     * @Param [registry]
     * @return void
     **/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //在根目录的my目录下有一张图片，这里配置好通过localhost:8080/my/图片名称来访问它，访问后请求资源从my目录里面拿
        registry.addResourceHandler("/my/**").addResourceLocations("classpath:/my/");
        super.addResourceHandlers(registry);
    }

    /**
     * 以前要访问一个页面需要先创建一个controller，再写方法跳转到页面
     * 在这里配置后可以直接访问localhost:8080/toLogin即跳转到login.html页面了
     **/
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("login");
        super.addViewControllers(registry);
    }

    /**
     * @Author haien
     * @Description 添加拦截规则
     * @Date 18:22 2018/7/19
     * @Param [registry]
     * @return void
     **/
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //addPathPatterns  用于添加拦截规则
        //excludePathPatterns  用于排除拦截规则
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin","/login","/hexo","/demo/getDemo","/demo2/save");
        super.addInterceptors(registry);
        //对所欲请求都拦截，但是排除/toLogin和/login
    }

}
