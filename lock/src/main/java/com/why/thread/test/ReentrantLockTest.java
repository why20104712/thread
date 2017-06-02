package com.why.thread.test;

import com.why.thread.extthread.ReentrantLockAAThread;
import com.why.thread.extthread.ReentrantLockAThread;
import com.why.thread.extthread.ReentrantLockBBThread;
import com.why.thread.extthread.ReentrantLockBThread;
import com.why.thread.service.ReentrantLockService;

public class ReentrantLockTest {

    public static void main(String[] args) {
        ReentrantLockService reentrantLockService = new ReentrantLockService();


        ReentrantLockAThread threadA = new ReentrantLockAThread(reentrantLockService);
        threadA.setName("A");
        ReentrantLockAAThread threadAA = new ReentrantLockAAThread(reentrantLockService);
        threadAA.setName("AA");
        ReentrantLockBThread threadB = new ReentrantLockBThread(reentrantLockService);
        threadB.setName("B");
        ReentrantLockBBThread threadBB = new ReentrantLockBBThread(reentrantLockService);
        threadBB.setName("BB");


        threadA.start();
        threadAA.start();
        threadB.start();
        threadBB.start();


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










//        ReentrantLockThread thread1 = new ReentrantLockThread(reentrantLockService);
//        ReentrantLockThread thread2 = new ReentrantLockThread(reentrantLockService);
//        ReentrantLockThread thread3 = new ReentrantLockThread(reentrantLockService);
//        ReentrantLockThread thread4 = new ReentrantLockThread(reentrantLockService);
//        ReentrantLockThread thread5 = new ReentrantLockThread(reentrantLockService);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();

        /**
         * 打印结果有序，说明线程同步
         */
//        当前线程的名称：Thread-0 0
//        当前线程的名称：Thread-0 1
//        当前线程的名称：Thread-0 2
//        当前线程的名称：Thread-0 3
//        当前线程的名称：Thread-0 4
//        当前线程的名称：Thread-1 0
//        当前线程的名称：Thread-1 1
//        当前线程的名称：Thread-1 2
//        当前线程的名称：Thread-1 3
//        当前线程的名称：Thread-1 4
//        当前线程的名称：Thread-2 0
//        当前线程的名称：Thread-2 1
//        当前线程的名称：Thread-2 2
//        当前线程的名称：Thread-2 3
//        当前线程的名称：Thread-2 4
//        当前线程的名称：Thread-3 0
//        当前线程的名称：Thread-3 1
//        当前线程的名称：Thread-3 2
//        当前线程的名称：Thread-3 3
//        当前线程的名称：Thread-3 4
//        当前线程的名称：Thread-4 0
//        当前线程的名称：Thread-4 1
//        当前线程的名称：Thread-4 2
//        当前线程的名称：Thread-4 3
//        当前线程的名称：Thread-4 4
    }
}
