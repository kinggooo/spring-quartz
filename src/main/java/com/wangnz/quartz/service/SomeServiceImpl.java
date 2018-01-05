package com.wangnz.quartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(SomeServiceImpl.class);

    @Async
    public void task1(){
        try {
            log.info("task1 start");
            Thread.sleep(20000);
            log.info("task1 end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
