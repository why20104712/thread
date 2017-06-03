package com.why.thread.readwrite.test;

import com.why.thread.readwrite.extthread.ReentrantReadWriteLockAThread;
import com.why.thread.readwrite.extthread.ReentrantReadWriteLockBThread;
import com.why.thread.readwrite.service.ReentrantReadWriteLockService;

public class ReentrantReadWriteLockTest {


    public static void main(String[] args) {

        ReentrantReadWriteLockService reentrantReadWriteLockService = new ReentrantReadWriteLockService();

        ReentrantReadWriteLockAThread reentrantReadWriteLockAThread = new ReentrantReadWriteLockAThread(reentrantReadWriteLockService);
        reentrantReadWriteLockAThread.start();

        ReentrantReadWriteLockBThread reentrantReadWriteLockBThread = new ReentrantReadWriteLockBThread(reentrantReadWriteLockService);

        reentrantReadWriteLockBThread.start();
    }


}
