package com.why.thread.task.extthread;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * 每隔一段时间执行定时任务
 * @author why
 * @date 2017/6/3 12:17
 */
public class PeriodTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("每隔一段时间beigin执行定时任务,当前系统时间：" + System.currentTimeMillis());


        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("每隔一段时间end执行定时任务,当前系统时间：" + System.currentTimeMillis());

    }
}
