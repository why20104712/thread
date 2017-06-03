package com.why.thread.task.extthread;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class TaskB extends TimerTask{

    @Override
    public void run() {
        System.out.println("B定时任务begin执行,当前时间是：" + System.currentTimeMillis());


        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("B定时任务end执行,当前时间是：" + System.currentTimeMillis());
    }
}
