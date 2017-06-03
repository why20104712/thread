package com.why.thread.test;

import com.why.thread.task.Task;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TaskTest {

    public static void main(String[] args) {


        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();

        /**
         * 当前时间之后10秒(任务会10秒后执行
         */
        calendar.add(Calendar.SECOND, 10);

        /**
         * 当前时间之前10秒(任务会直接执行)
         */
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 10);


        Date date = calendar.getTime();

//        Timer timer = new Timer(true);
        Timer timer = new Timer();
        timer.schedule(new Task(), date);

    }
}
