package com.why.syncmethod;

/**
 * 演示synchronized锁重入
 * 可重入锁：自己还可以获取自己内部锁
 * @author why
 * @date 2017/4/24 13:24
 */
public class Service {


    public synchronized void service1() {
        System.out.println("service1");
        service2();
    }

    private synchronized void service2() {
        System.out.println("service2");
        service3();
    }

    private synchronized void service3() {
        System.out.println("service3");
    }
}
