package com.why.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 测试arrayList的线程不安全问题
 * @author why
 * @date 2017/4/7 13:42
 */
public class ListTest {

    public synchronized static void main(String[] args) {


        /**
         * 每个线程往list里放100个对象，1000个线程同时操作
         */

//        List list = new Vector();//线程安全
        List list = new ArrayList();//线程不安全

        CountDownLatch countDownLatch = new CountDownLatch(1000);

        for (int i = 0; i < 1000; i++) {
            ListThread listThread = new ListThread(list, countDownLatch);
            listThread.start();
        }

        try {
            /**
             * 主线程等待所有子线程执行完成后再操作
             */
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());

    }

}
