package com.why.syncmethod;

/**
 * 自定义对象
 * @author why
 * @date 2017/4/24 11:06
 */
public class MyObject {


    public synchronized void methodA() {
        System.out.println("begin methodA threadName=" + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }

}
