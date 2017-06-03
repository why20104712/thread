package com.why.thread.task.extthread;

import java.util.TimerTask;

/**
 * Timer类的cancle方法将任务队列中的所有任务全部清除,需要注意的是：并不一定会停止计划任务，因为有时候并没有抢到queue锁，所以会正常执行
 * @author why
 * @date 2017/6/3 12:30
 */
public class TimerCancleCare extends TimerTask {

    private Integer i;

    public TimerCancleCare(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i + "任务未成功取消，系统当前时间：" + System.currentTimeMillis());

    }
}
