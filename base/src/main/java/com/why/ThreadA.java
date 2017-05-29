package com.why;

/**
 * 实现线程的两种方法：
 * 继承Thread类
 * 实现Runnable接口
 */
public class ThreadA extends Thread {


    @Override
    public void run() {

        System.out.println("当前线程的id：" + Thread.currentThread().getId());
        System.out.println("当前线程的名称：" + Thread.currentThread().getName());


        try {
            /**
             * 当前正在执行的线程，休眠1秒
             */
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 只有在线程类使用this
         */
//        System.out.println("(this)当前线程的id：" + this.currentThread().getId());
//        System.out.println("(this)当前线程的名称：" + this.currentThread().getName());

        /**
         * 中断当前线程
         */
        Thread.currentThread().interrupt();

//        System.out.println("当前线程是否停止1：" + Thread.interrupted());
//        System.out.println("当前线程是否停止2：" + Thread.interrupted());


        /**
         * 判断线程是否中断，执行后，不清除状态标识
         */
        boolean interrupted = this.isInterrupted();
        if (interrupted) {
            System.out.println("当前线程停止");
        } else {
            System.out.println("当前线程未停止" );
        }

    }
}
