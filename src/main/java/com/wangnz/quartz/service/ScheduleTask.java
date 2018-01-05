package com.wangnz.quartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component // 此注解必加
public class ScheduleTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class);

    public void sayHello() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Hello world, i'm the king of the world!!!");
    }
}