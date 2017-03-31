package com.why.threadlocal;


import java.util.Random;

/**
 * 模拟多线程获取价钱问题，这种方式会出现价格紊乱问题
 * @author why
 * @date 2017/3/31 13:40
 */
public class MockPrice2 {

    /**
     * 商品价格
     */
    private static int price;

    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {

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
