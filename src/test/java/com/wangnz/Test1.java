package com.wangnz;

import com.wangnz.quartz.service.SomeServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutionException;


public class Test1 extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(Test1.class);

    @Autowired
    private SomeServiceImpl svc;

    @Test
    public void test1() throws InterruptedException, ExecutionException {
        log.info("test1 start");
        svc.task1();
        log.info("test1 end");
        Thread.sleep(60000);
    }
}
