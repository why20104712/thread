package com.why.thread.service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用ReentrantLock进行线程同步
 *
 * @author why
 * @date 2017/6/2 17:08
 */
public class ReentrantLockService {


    private Lock lock = new ReentrantLock();

    public void testMethod() {
        lock.lock();

        for (int i = 0; i < 5; i++) {
            System.out.println("当前线程的名称：" + Thread.currentThread().getName() + " " + i);
        }

        lock.unlock();
    }

}
