package com.cs102.dothackSpringboot.utility;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class scheduleUtil {

    @Scheduled(fixedDelay = 10000)
    public void scheduleFixedDelayTask() {
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
    } //Second task execution will start 1 second after the end of first task

    @Scheduled(cron = "0 0 0 ? * * *")
    public void scheduleFixedRateTask1() {
        System.out.println("I want to call API 1");
    } //fixed interval between 2 tasks

    @Scheduled(cron = "0 0 0,12 ? * * *")
    public void scheduleFixedRateTask2() {
        System.out.println("I want to call API 2");
    } //fixed interval between 2 tasks
}
