package com.why.thread.task;

import java.util.TimerTask;

public class Task extends TimerTask{

    @Override
    public void run() {
        System.out.println("定时任务执行了,当前时间是：" + System.currentTimeMillis());
    }
}
