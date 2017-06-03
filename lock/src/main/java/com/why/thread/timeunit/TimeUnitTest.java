package com.why.thread.timeunit;

import java.util.concurrent.TimeUnit;

public class TimeUnitTest {

    public static void main(String[] args) {
        //关于秒的常用方法
        System.out.println(TimeUnit.SECONDS.toMillis(1));
        TimeUnit.SECONDS.toMillis(1);     //1秒转换为毫秒数
        TimeUnit.SECONDS.toMinutes(60);   //60秒转换为分钟数
        try {
            /**
             * 线程休眠5秒
             */
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 1分钟转换为秒数
         */
        TimeUnit.SECONDS.convert(1, TimeUnit.MINUTES);

//TimeUnit.DAYS			日的工具类
//TimeUnit.HOURS		时的工具类
//TimeUnit.MINUTES		分的工具类
//TimeUnit.SECONDS		秒的工具类
//TimeUnit.MILLISECONDS	毫秒的工具类
    }
}
