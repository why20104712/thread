package cn.why.thread.service;

public class Service {

    synchronized public static void testBlockState() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + "======线程在testBlockState方法中的状态是：" + Thread.currentThread().getState());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
