package com.jk.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jikai on 2017/11/6.
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.jk.controller.CatController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void beforeLog(JoinPoint joinPoint) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();

        // url
        logger.info("url={}", httpServletRequest.getRequestURL());

        // method
        logger.info("method={}", httpServletRequest.getMethod());

        // ip
        logger.info("ip={}", httpServletRequest.getRemoteAddr());

        // name
        logger.info("name={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        // args
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("log())")
    public void afterLog() {
        logger.info("end log");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info("response={}", object.toString());
    }
}
