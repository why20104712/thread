package com.why.thread.task.extthread;

import java.util.TimerTask;

/**
 * Timer类的cancle方法将任务队列中的所有任务全部清除
 * @author why
 * @date 2017/6/3 12:30
 */
public class TimerCancle extends TimerTask {
    @Override
    public void run() {

        System.out.println("系统当前时间：" + System.currentTimeMillis());

    }
}
