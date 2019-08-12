package com.ltl.task;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 用注解的方式开发springtask定时器
 */
@Component
public class TaskDemo2 {

    //每一秒执行一次
    @Scheduled(cron = "0/1 * * * * ?")
    public void job1(){
        System.out.printf("Task: %s, Current time: %s\n", 1, LocalDateTime.now());
    }

    //每分钟的第10秒执行
    @Scheduled(cron = "10 * * * * ?")
    public void job2(){
        System.out.printf("Task: %s, Current time: %s\n", 1, LocalDateTime.now());
    }
}
