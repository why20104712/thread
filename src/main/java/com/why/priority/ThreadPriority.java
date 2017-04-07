package com.why.priority;

/**
 * 测试线程优先级的特性
 * 继承，规则性，随机性
 * @author why
 * @date 2017/4/7 15:55
 */
public class ThreadPriority {


        /**
         * The minimum priority that a thread can have.
         */
        public final static int MIN_PRIORITY = 1;

        /**
         * The default priority that is assigned to a thread.
         */
        public final static int NORM_PRIORITY = 5;

        /**
         * The maximum priority that a thread can have.
         */
        public final static int MAX_PRIORITY = 10;


    public static void main(String[] args) {


        System.out.println("主线程的优先级：" + Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority());

        ThreadA threadA = new ThreadA();
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadA.start();


    }
}
