package com.why.thread.task.test;

import com.why.thread.task.extthread.TimerTaskCancle;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 测试任务自己从队列中移除自己
 * @author why
 * @date 2017/6/3 12:32
 */
public class TimerTaskCancleTest {

    public static void main(String[] args) {


        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();

        /**
         * 当前时间之后10秒(任务会10秒后执行
         */
        calendar.add(Calendar.SECOND, 10);
        Date date = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(new TimerTaskCancle(), date);
    }
}
