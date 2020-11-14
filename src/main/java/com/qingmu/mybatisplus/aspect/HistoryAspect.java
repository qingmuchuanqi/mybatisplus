package com.qingmu.mybatisplus.aspect;

import com.qingmu.mybatisplus.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HistoryAspect {

    /**
     *  层切点
     */
    @Pointcut("@annotation(com.qingmu.mybatisplus.annotion.History)")
    public void controllerAspect(){

        System.out.println("***********层切点**************");
    }

    /**
     * 前置通知
     * @param joinPoint
     */
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint){

        System.out.println("***********前置通知**************");
    }

    /**
     * 后置通知
     * @param joinPoint
     */
    @After("controllerAspect()")
    public  void after(JoinPoint joinPoint) throws Exception{
        System.out.println("***********后置通知**************");
        Object[] args = joinPoint.getArgs();
    }

    /**
     * 返回通知通知（返回通知）
     */
    @AfterReturning(returning = "ret",pointcut = "controllerAspect()")
    public void doAfterReturningGame(Object ret){

//        User historyBo = (User) ret;
        System.out.println("***********返回通知**************: " + ret);
    }

}