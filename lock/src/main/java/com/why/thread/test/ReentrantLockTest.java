package com.why.thread.test;

import com.why.thread.extthread.ReentrantLockThread;
import com.why.thread.service.ReentrantLockService;

public class ReentrantLockTest {

    public static void main(String[] args) {
        ReentrantLockService reentrantLockService = new ReentrantLockService();

        ReentrantLockThread thread1 = new ReentrantLockThread(reentrantLockService);
        ReentrantLockThread thread2 = new ReentrantLockThread(reentrantLockService);
        ReentrantLockThread thread3 = new ReentrantLockThread(reentrantLockService);
        ReentrantLockThread thread4 = new ReentrantLockThread(reentrantLockService);
        ReentrantLockThread thread5 = new ReentrantLockThread(reentrantLockService);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

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
