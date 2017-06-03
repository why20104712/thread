package com.why.thread.task.test;

import com.why.thread.task.extthread.TimerCancleCare;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Timer类的cancle方法将任务队列中的所有任务全部清除,需要注意的是：并不一定会停止计划任务，因为有时候并没有抢到queue锁，所以会正常执行
 * @author why
 * @date 2017/6/3 12:32
 */
public class TimerCancleCareTest {

    public static void main(String[] args) {


        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime();

        Integer i = 0;

        while (true) {
            i++;
            Timer timer = new Timer();
            timer.schedule(new TimerCancleCare(i), date);
            timer.cancel();

            if (i == 10000) {
                break;
            }
        }

    }
}
