package com.why.thread.readwrite.service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockService {


    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();


    /**
     * 读读共享
     */
    public void readShare() {

        try {
            try {
                reentrantReadWriteLock.readLock().lock();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("read读读共享，当前线程名称：" + Thread.currentThread().getName() + "当前时间：" + System.currentTimeMillis());
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     * 写写互斥，读写互斥，写读互斥
     */
    public void writeMutex() {

        try {
            try {
                reentrantReadWriteLock.writeLock().lock();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("write写写互斥，只要存在写线程就互斥，当前线程名称：" + Thread.currentThread().getName() + "当前时间：" + System.currentTimeMillis());
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
