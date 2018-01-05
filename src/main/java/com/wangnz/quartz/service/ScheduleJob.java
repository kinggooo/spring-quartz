package com.wangnz.quartz.service;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleJob {
    private static final Logger log = LoggerFactory.getLogger(ScheduleJob.class);

    @Autowired
    private SomeServiceImpl svc;

    @Scheduled(fixedRate = 2000)
    public void job1() throws SchedulerException {
        log.info("job1 start");
        svc.task1();
        log.info("job1 end");
    }

//    @Scheduled(fixedRate = 2000)
//    @Async
    public void job2() throws SchedulerException {
        log.info("job2 start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("job2 end");
    }
}
