package com.wangnz.quartz.service;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

//@Component
public class ScheduleRefreshDatabase {
//    @Autowired
//    private ConfigRepository repository;

//    @Resource(name = "jobDetail")
//    private JobDetail jobDetail;
//
//    @Resource(name = "jobTrigger")
//    private CronTrigger cronTrigger;
//
//    @Resource(name = "scheduler")
//    private Scheduler scheduler;

    private static final Logger log = LoggerFactory.getLogger(ScheduleRefreshDatabase.class);

    //@Scheduled(fixedRate = 5000) // 每隔5s查库，并根据查询结果决定是否重新设置定时任务
    public void task1() throws SchedulerException {

        log.info("task1 5秒刷新");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(cronTrigger.getKey());
//        String currentCron = trigger.getCronExpression();// 当前Trigger使用的
//        String searchCron = repository.findOne(1L).getCron();// 从数据库查询出来的
//        System.out.println(currentCron);
//        System.out.println(searchCron);
//        if (currentCron.equals(searchCron)) {
//            // 如果当前使用的cron表达式和从数据库中查询出来的cron表达式一致，则不刷新任务
//        } else {
//            // 表达式调度构建器
//            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(searchCron);
//            // 按新的cronExpression表达式重新构建trigger
//            trigger = (CronTrigger) scheduler.getTrigger(cronTrigger.getKey());
//            trigger = trigger.getTriggerBuilder().withIdentity(cronTrigger.getKey())
//                    .withSchedule(scheduleBuilder).build();
//            // 按新的trigger重新设置job执行
//            scheduler.rescheduleJob(cronTrigger.getKey(), trigger);
//            currentCron = searchCron;
//        }
    }

    @Scheduled(fixedRate = 1000)
    public void task2() throws SchedulerException {
        log.info("task2 start:" + Thread.currentThread());
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("task2 stop:" + Thread.currentThread());
    }

//    @Scheduled(fixedRate = 5000)
//    public void task3() throws SchedulerException {
//        log.info("task3 start:" + Thread.currentThread());
//        log.info("task3 stop:" + Thread.currentThread());
//    }
}
