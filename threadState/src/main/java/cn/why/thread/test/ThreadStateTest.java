package cn.why.thread.test;

import cn.why.thread.ThreadState;
import cn.why.thread.extthread.ThreadA;
import cn.why.thread.extthread.ThreadB;
import cn.why.thread.extthread.ThreadWait;

/**
 * 线程的几种状态的测试
 * @author why
 * @date 2017/6/1 22:32
 */
public class ThreadStateTest {

    /**
     * 线程的五种状态
     *  NEW
     * RUNNABLE
     * TERMINATED
     * TIMED_WAITING(线程sleep)
     * BLOCKED(线程等待对象锁，存在锁竞争)
     * WAITING(调用了对象的wait方法，线程进入WAITING状态)
     */

    public static void main(String[] args) {

        try {
            ThreadState threadState = new ThreadState();

            System.out.println("睡眠前，线程名称：" + threadState.getName() + "=====线程状态："+ threadState.getState());
            System.out.println("睡眠前，线程名称：" + Thread.currentThread().getName() + "=====线程状态："+ Thread.currentThread().getState());
            Thread.sleep(1000);
            System.out.println("睡眠后，线程名称：" + Thread.currentThread().getName() + "=====线程状态："+ Thread.currentThread().getState());
            System.out.println("睡眠后，线程名称：" + threadState.getName() + "=====线程状态："+ threadState.getState());


            threadState.start();
            /**
             * 主线程睡眠两秒，子线程执行结束，状态变为TERMINATED
             */
//            Thread.sleep(2000);
//            Thread.sleep(3000);
            System.out.println("线程名称：" + Thread.currentThread().getName() + "=====线程状态："+ Thread.currentThread().getState());
            System.out.println("线程名称：" + threadState.getName() + "=====线程状态："+ threadState.getState());


            ThreadA threadState1 = new ThreadA();
            ThreadB threadState2 = new ThreadB();

            threadState1.start();
            threadState2.start();
            Thread.sleep(1000);
            System.out.println("线程名称：" + threadState2.getName() + "=====线程状态："+ threadState2.getState());


            ThreadWait threadWait = new ThreadWait();
            threadWait.start();
            Thread.sleep(1000);
            System.out.println("线程名称：" + threadWait.getName() + "=====线程状态："+ threadWait.getState());




        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
