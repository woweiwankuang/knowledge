package com.mytest.demo.safe.security.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration //写配置类来注入第三方过滤器或自己的过滤器
public class SafeConfig {

    //通过bean方式来注入过滤器
    @Bean
    public FilterRegistrationBean TimeFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        filterRegistrationBean.setFilter(new TimeFilter());
        filterRegistrationBean.setUrlPatterns(Collections.singleton("/*"));//可以指定此过滤器生效的url
        return filterRegistrationBean;
    }
}
