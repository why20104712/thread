package com.why.thread.task.extthread;

import java.util.TimerTask;

/**
 * 每隔一段时间执行定时任务
 * @author why
 * @date 2017/6/3 12:17
 */
public class PeriodTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("每隔一段时间执行定时任务,当前系统时间：" + System.currentTimeMillis());
    }
}
