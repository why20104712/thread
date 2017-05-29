package com.why;

/**
 * 线程的基本操作
 * @author why
 * @date 2017/5/29 10:48
 */
public class ThreadOperation {


    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        System.out.println("当前线程的id：" + Thread.currentThread().getId());
        System.out.println("当前线程的名称：" + Thread.currentThread().getName());
        threadA.start();


        /**
         * 中断线程
         */
//        threadA.interrupt();

        Thread.currentThread().interrupt();
        /**
         * 判断线程中断
         */
//        boolean interrupted = Thread.interrupted();
        boolean interrupted = Thread.currentThread().isInterrupted();

        if (interrupted) {
            System.out.println("当前线程停止");
        } else {
            System.out.println("当前线程未停止" );
        }
    }


}
