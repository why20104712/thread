package com.why.thread.extthread;

import com.why.thread.service.ReentrantLockService;

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
