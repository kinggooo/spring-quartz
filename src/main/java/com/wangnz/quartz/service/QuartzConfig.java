package com.wangnz.quartz.service;

import com.wangnz.quartz.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
//@EnableScheduling
@EnableAsync
public class QuartzConfig {
    /** Set the ThreadPoolExecutor's core pool size. */
    private int corePoolSize = 10;
    /** Set the ThreadPoolExecutor's maximum pool size. */
    private int maxPoolSize = 200;
    /** Set the capacity for the ThreadPoolExecutor's BlockingQueue. */
    private int queueCapacity = 10;

    private String ThreadNamePrefix = "MyLogExecutor-";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "TaskPool")
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(2);
        return taskScheduler;
    }

//    @Bean
//    public Executor logExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(corePoolSize);
//        executor.setMaxPoolSize(maxPoolSize);
//        executor.setQueueCapacity(queueCapacity);
//        executor.setThreadNamePrefix(ThreadNamePrefix);
//
//        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
//        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        executor.initialize();
//        return executor;
//    }


//    @Override
//    public Executor getAsyncExecutor() {
//        ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();
//        threadPool.setCorePoolSize(1);
//        threadPool.setMaxPoolSize(1);
//        threadPool.setWaitForTasksToCompleteOnShutdown(true);
//        threadPool.setAwaitTerminationSeconds(60 * 15);
//        threadPool.setThreadNamePrefix("MyAsync-");
//        threadPool.initialize();
//        return threadPool;
//    }
//
//    @Override
//    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//        return new MyAsyncExceptionHandler();
//    }
//
//    /**
//     * 自定义异常处理类
//     * @author hry
//     *
//     */
//    class MyAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
//
//        @Override
//        public void handleUncaughtException(Throwable throwable, Method method, Object... obj) {
//            log.info("Exception message - " + throwable.getMessage());
//            log.info("Method name - " + method.getName());
//            for (Object param : obj) {
//                log.info("Parameter value - " + param);
//            }
//        }
//
//    }
}
