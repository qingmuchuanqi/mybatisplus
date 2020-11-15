package com.qingmu.mybatisplus.aspect;

import com.qingmu.mybatisplus.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class HistoryAspect {

    private static final Logger logger = LoggerFactory.getLogger(HistoryAspect.class);

    /**
     * 层切点
     */
    @Pointcut("@annotation(com.qingmu.mybatisplus.annotion.History)")
    public void controllerAspect() {

        logger.info("***********层切点**************");

    }

    /**
     * 前置通知
     *
     * @param joinPoint
     */
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {

        logger.info("***********前置通知**************");

        Object[] args = joinPoint.getArgs();
        if(args.length>0){
            Object arg = args[1];
            User user=(User)arg;
            user.setCreatTm(LocalDateTime.now());
            user.setName("ada");
        }

    }

    /**
     * 后置通知
     *
     * @param joinPoint
     */
    @After("controllerAspect()")
    public void after(JoinPoint joinPoint) throws Exception {

        logger.info("***********后置通知**************");

        Object[] args = joinPoint.getArgs();
        if(args.length>0){
            Object arg = args[1];
            User user=(User)arg;
            user.setCreatTm(LocalDateTime.now());
            user.setName("ada");
        }

    }

    /**
     * 返回通知通知（返回通知）
     */
    @AfterReturning(returning = "ret", pointcut = "controllerAspect()")
    public void doAfterReturningGame(Object ret) {

        logger.info("***********返回通知**************: {}" , ret);

    }

}