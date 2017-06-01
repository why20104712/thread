package cn.why.thread.test;

import cn.why.thread.ThreadState;

/**
 * 线程的几种状态的测试
 * @author why
 * @date 2017/6/1 22:32
 */
public class ThreadStateTest {

    /**
     * NEW
     * RUNNABLE
     * TERMINATED
     */

    public static void main(String[] args) {

        try {
            ThreadState threadState = new ThreadState();

            System.out.println("睡眠前，线程名称：" + threadState.getName() + "=====线程状态："+ threadState.getState());
            System.out.println("睡眠前，线程名称：" + Thread.currentThread().getName() + "=====线程状态："+ Thread.currentThread().getState());
            Thread.sleep(2000);
            System.out.println("睡眠后，线程名称：" + Thread.currentThread().getName() + "=====线程状态："+ Thread.currentThread().getState());
            System.out.println("睡眠后，线程名称：" + threadState.getName() + "=====线程状态："+ threadState.getState());


            threadState.start();
            /**
             * 主线程睡眠两秒，子线程执行结束，状态变为TERMINATED
             */
            Thread.sleep(2000);
            System.out.println("线程名称：" + Thread.currentThread().getName() + "=====线程状态："+ Thread.currentThread().getState());
            System.out.println("线程名称：" + threadState.getName() + "=====线程状态："+ threadState.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
