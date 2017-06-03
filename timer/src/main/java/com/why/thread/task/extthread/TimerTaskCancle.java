package com.why.thread.task.extthread;

import java.util.TimerTask;

/**
 * TimerTask的cancle方法任务取消,将自身从队列中移除
 * @author why
 * @date 2017/6/3 12:30
 */
public class TimerTaskCancle extends TimerTask {
    @Override
    public void run() {

        System.out.println("系统当前时间：" + System.currentTimeMillis());
        this.cancel();
        System.out.println("任务从队列中自己移除了自己");

    }
}
