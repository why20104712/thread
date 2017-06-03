package com.why.thread.test;

import com.why.thread.task.extthread.PeriodTask;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class PeriodTaskTest {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();

        /**
         * 当前时间之后10秒(任务会10秒后执行
         */
        calendar.add(Calendar.SECOND, 10);
        Date date1 = calendar.getTime();

        /**
         * 当前时间之前10秒(任务会10秒后执行
         */
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 10);
        Date date2 = calendar.getTime();
        Timer timer = new Timer();
        /**
         * 每隔4000毫秒执行任务
         */
//        timer.schedule(new PeriodTask(), date1, 4000);
        timer.schedule(new PeriodTask(), date2, 4000);
    }
}
