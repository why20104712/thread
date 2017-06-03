package com.why.thread.test;

import com.why.thread.task.extthread.Task;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 测试TimerTask执行任务的时间和当前时间相比，之前，之后的情况
 * @author why
 * @date 2017/6/3 12:14
 */
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
