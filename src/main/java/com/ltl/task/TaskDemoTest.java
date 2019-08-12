package com.ltl.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskDemoTest {
    public static void main(String[] args) {
        //配置文件
        //ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-task.xml");
        //注解的方式  11111
        ApplicationContext context2=new ClassPathXmlApplicationContext("classpath:spring-task2.xml");
    }
}
