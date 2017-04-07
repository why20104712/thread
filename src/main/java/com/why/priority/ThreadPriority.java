package com.why.priority;

/**
 * 测试线程优先级的特性
 * @author why
 * @date 2017/4/7 15:55
 */
public class ThreadPriority {

    public static void main(String[] args) {

        System.out.println("主线程的优先级：" + Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority());

        ThreadA threadA = new ThreadA();
        threadA.start();


    }
}
