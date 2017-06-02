package com.why.thread.lock.extthread;

import com.why.thread.lock.service.ReentrantLockService;

public class ReentrantLockThread extends Thread {

    private ReentrantLockService reentrantLockService;

    public ReentrantLockThread(ThreadGroup threadGroup, String name, ReentrantLockService reentrantLockService) {
        super(threadGroup, name);
        this.reentrantLockService = reentrantLockService;
    }

    @Override
    public void run() {
        reentrantLockService.testMethod();
    }
}
