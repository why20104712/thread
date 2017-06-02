package com.why.thread.lock.test;

import com.why.thread.lock.extthread.*;
import com.why.thread.lock.service.ReentrantLockService;

public class ReentrantLockTest {

    public static void main(String[] args) {
        ReentrantLockService reentrantLockService = new ReentrantLockService();


//        ReentrantLockAThread threadA = new ReentrantLockAThread(reentrantLockService);
//        threadA.setName("A");
//        ReentrantLockAAThread threadAA = new ReentrantLockAAThread(reentrantLockService);
//        threadAA.setName("AA");
//        ReentrantLockBThread threadB = new ReentrantLockBThread(reentrantLockService);
//        threadB.setName("B");
//        ReentrantLockBBThread threadBB = new ReentrantLockBBThread(reentrantLockService);
//        threadBB.setName("BB");
//        threadA.start();
//        threadAA.start();
//        threadB.start();
//        threadBB.start();


        /**
         * 线程存在竞争，lock方法，线程会获得对象监视器
         * 其他线程只有等待锁被释放，在争抢锁
         */
//        当前线程的名称：A testMethodA time = 1496400930666
//        当前线程的名称：A testMethodA time = 1496400933667
//        当前线程的名称：AA testMethodA time = 1496400933667
//        当前线程的名称：AA testMethodA time = 1496400936668
//        当前线程的名称：B testMethodB time = 1496400936668
//        当前线程的名称：B testMethodB time = 1496400939669
//        当前线程的名称：BB testMethodB time = 1496400939669
//        当前线程的名称：BB testMethodB time = 1496400942669


        ThreadGroup threadGroup = new ThreadGroup("ReentrantLockThreadGroup");
        ReentrantLockThread thread1 = new ReentrantLockThread(threadGroup, "thread1", reentrantLockService);
        ReentrantLockThread thread2 = new ReentrantLockThread(threadGroup, "thread2", reentrantLockService);
        ReentrantLockThread thread3 = new ReentrantLockThread(threadGroup, "thread3", reentrantLockService);
        ReentrantLockThread thread4 = new ReentrantLockThread(threadGroup, "thread4", reentrantLockService);
        ReentrantLockThread thread5 = new ReentrantLockThread(threadGroup, "thread5", reentrantLockService);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("线程组名称：" + threadGroup.getName() + "线程组活动的线程数：" + threadGroup.activeCount());

        /**
         * 打印结果有序，说明线程同步
         */
//        当前线程的名称：Thread-4 0
//        当前线程的名称：Thread-4 1
//        当前线程的名称：Thread-4 2
//        当前线程的名称：Thread-4 3
//        当前线程的名称：Thread-4 4
//        当前线程的名称：Thread-5 0
//        当前线程的名称：Thread-5 1
//        当前线程的名称：Thread-5 2
//        当前线程的名称：Thread-5 3
//        当前线程的名称：Thread-5 4
//        当前线程的名称：Thread-7 0
//        当前线程的名称：Thread-7 1
//        当前线程的名称：Thread-7 2
//        当前线程的名称：Thread-7 3
//        当前线程的名称：Thread-7 4
//        当前线程的名称：Thread-6 0
//        当前线程的名称：Thread-6 1
//        当前线程的名称：Thread-6 2
//        当前线程的名称：Thread-6 3
//        当前线程的名称：Thread-6 4
//        当前线程的名称：Thread-8 0
//        当前线程的名称：Thread-8 1
//        当前线程的名称：Thread-8 2
//        当前线程的名称：Thread-8 3
//        当前线程的名称：Thread-8 4
    }
}
