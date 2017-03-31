package com.why.threadlocal;


import java.util.Random;

/**
 * 模拟多线程获取价钱问题，使用ThreadLocal方式，以空间换时间，来保证各个线程的访问变量都是独立的副本
 * ThreadLocal针对每个线程，都会单独一份资源副本，每个线程只操作自己的副本，不会修改别的线程的副本
 * ThreadLocal中有个静态内部类ThreadLocalMap，key为每个线程的对象，value为资源副本，这样就可以保证每个资源都是自己的副本
 * @author why
 * @date 2017/3/31 13:40
 */
public class MockPrice4 {

    /**
     * 商品价格线程副本，多个线程共有资源，存在资源竞争
     */
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    /**
     * 商品价格
     */
    public static int price;

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {

                    //每个线程的业务操作
                    price = new Random().nextInt(10000);
                    threadLocal.set(price);
                    System.out.println(Thread.currentThread().getName() + " 当前价格为：" + price);
                    /**
                     * A模块进行处理
                     */
                    new A().getPrice();
                    /**
                     * B模块进行处理
                     */
                    new B().getPrice();
                }
            }).start();

        }

    }

    static class A {

        void getPrice() {
            System.out.println(Thread.currentThread().getName() + " A线程处理价格，获取的价格值为：" + threadLocal.get());
        }

    }


    static class B {

        void getPrice() {
            System.out.println(Thread.currentThread().getName() + " B线程处理价格，获取的价格值为：" + threadLocal.get());
        }

    }

}
