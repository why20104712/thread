package com.why.thread.task.test;

import com.why.thread.task.extthread.Task;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 测试一个Timer可以有多个任务，任务以队列的方式执行
 * @author why
 * @date 2017/6/3 12:13
 */
public class MultiTaskTest {

    public static void main(String[] args) {

        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();

        /**
         * 当前时间之后10秒(任务会10秒后执行
         */
        calendar.add(Calendar.SECOND, 10);
        Date date1 = calendar.getTime();

        calendar.add(Calendar.SECOND, 20);
        Date date2 = calendar.getTime();
        Timer timer = new Timer();

        /**
         * TimerTask以队列的方式顺序的执行
         */
        timer.schedule(new Task(), date1);
        timer.schedule(new Task(), date2);
    }
}
