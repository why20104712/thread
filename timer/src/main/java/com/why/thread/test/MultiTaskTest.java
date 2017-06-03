package com.why.thread.test;

import com.why.thread.task.Task;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

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
