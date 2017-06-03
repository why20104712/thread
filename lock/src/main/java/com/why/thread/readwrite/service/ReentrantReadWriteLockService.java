package com.why.thread.readwrite.service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockService {


    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();


    /**
     * 读读共享
     */
    public void read() {

        try {
            try {
                reentrantReadWriteLock.readLock().lock();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("read读读共享，当前线程名称：" + Thread.currentThread().getName());
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     * 写写互斥
     */
    public void write() {

        try {
            try {
                reentrantReadWriteLock.writeLock().lock();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("write写写互斥，当前线程名称：" + Thread.currentThread().getName());
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
