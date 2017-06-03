package com.why.thread.task.extthread;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Task extends TimerTask{

    @Override
    public void run() {
        System.out.println("定时任务执行了,当前时间是：" + System.currentTimeMillis());


        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("定时任务执行了,当前时间是：" + System.currentTimeMillis());
    }
}
