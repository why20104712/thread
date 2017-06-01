package com.why.threadlocal;


import java.util.Random;

/**
 * 模拟多线程获取价钱问题，使用锁机制进行资源访问控制
 * @author why
 * @date 2017/3/31 13:40
 */
public class MockPrice3 {

    /**
     * 商品价格，多个线程共有资源，存在资源竞争
     */
    private static int price;

    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {

                    /**
                     * 通过加锁的防止进行共享资源的访问控制，在不同的对象上加锁，依然会存在资源竞争
                     * 锁在同一个对象上，才会起到保护作用
                     */
                    synchronized (MockPrice3.class) {
                        //每个线程的业务操作
                        price = new Random().nextInt(10000);
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

                }
            }).start();

        }

    }

    static class A {

        void getPrice() {
            System.out.println(Thread.currentThread().getName() + " A线程处理价格，获取的价格值为：" + price);
        }

    }


    static class B {

        void getPrice() {
            System.out.println(Thread.currentThread().getName() + " B线程处理价格，获取的价格值为：" + price);
        }

    }

}
