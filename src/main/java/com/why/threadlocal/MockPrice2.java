package com.why.threadlocal;


import java.util.Random;

/**
 * 模拟多线程获取价钱问题，不存在竞争，所以不会有不同线程价格错乱问题
 * @author why
 * @date 2017/3/31 13:40
 */
public class MockPrice2 {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    int price = new Random().nextInt(10000);

                    //每个线程的业务操作
                    /**
                     * 商品价格，在这个位置不属于共享资源，不存在竞争，所以不会有不同线程价格错乱问题
                     */
                    System.out.println(Thread.currentThread().getName() + " 当前价格为：" + price);
                    /**
                     * A模块进行处理
                     */
                    new A().getPrice(price);
                    /**
                     * B模块进行处理
                     */
                    new B().getPrice(price);
                }
            }).start();

        }

    }

    static class A {

        void getPrice(int price) {
            System.out.println(Thread.currentThread().getName() + " A线程处理价格，获取的价格值为：" + price);
        }

    }


    static class B {

        void getPrice(int price) {
            System.out.println(Thread.currentThread().getName() + " B线程处理价格，获取的价格值为：" + price);
        }

    }

}
