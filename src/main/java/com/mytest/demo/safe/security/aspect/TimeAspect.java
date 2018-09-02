package com.mytest.demo.safe.security.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 切面
 * 不可以拿到原始的http请求和响应信息，能知道是哪个类（控制器）的哪个方法处理请求,可以获取到传参的具体值
 */
@Aspect
@Component
public class TimeAspect {

    //@Before() 方法调用之前
    //@After() 方法调用之后
    //@AfterThrowing 方法抛出异常时
    //around包含以上3种，可以自己处理
    @Around("exeuction(* xx.xx.controller.xxController.*(..))")//第一个*表示任何返回值，后面指定类名的任何方法，这个方法包含任何参数
    public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable{
        Object[] args = pjp.getArgs();//获取传参
        Object object = pjp.proceed();//调用被拦截的方法，返回值为被拦截方法的返回值
        return object;
    }
}
