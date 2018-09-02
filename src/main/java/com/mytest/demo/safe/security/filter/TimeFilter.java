package com.mytest.demo.safe.security.filter;

import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.time.Instant;

/**
 * 过滤器
 * 只可以拿到原始的http请求和响应信息
 */
@Component  //通过注解来注入
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //具体处理
        System.out.println("timeFilter start");
        System.out.println(Instant.now().toEpochMilli());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("timeFilter start");
    }

    @Override
    public void destroy() {
        //销毁
    }
}
