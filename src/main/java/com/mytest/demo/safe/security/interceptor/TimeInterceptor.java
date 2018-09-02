package com.mytest.demo.safe.security.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;

/**
 * 拦截器
 * 可以拿到原始的http请求和响应信息，能知道是哪个类（控制器）的哪个方法处理请求，但是不知道传参的具体值！！！
 */
@Component //光写注解没用，必须要配置bean，拦截器也会拦截spring的请求
public class TimeInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //控制器之前调用
        //handler里面无法获取到传参的具体值！！！
        System.out.println(((HandlerMethod)handler).getBean().getClass().getName());//获取控制器名称
        System.out.println(((HandlerMethod)handler).getMethod().getName());//获取实际调用的方法名称
        request.setAttribute("startTime", Instant.now().toEpochMilli());//可以对请求添加属性
        //返回值为false则不会执行之后的方法
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //控制器成功处理后调用此方法，如控制器抛异常，则此方法不调用
        Long startTime = (Long) request.getAttribute("startTime");//获取到添加的属性
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //控制器处理后调用此方法（不管是否成功),ex为抛出的异常，如没有则为null，如抛出异常但被处理也为null
        Long startTime = (Long) request.getAttribute("startTime");//获取到添加的属性
    }
}
