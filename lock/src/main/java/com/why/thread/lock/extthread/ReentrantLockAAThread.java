package com.why.thread.lock.extthread;

import com.why.thread.lock.service.ReentrantLockService;

public class ReentrantLockAAThread extends Thread {

    private ReentrantLockService reentrantLockService;

    public ReentrantLockAAThread(ReentrantLockService reentrantLockService) {
        this.reentrantLockService = reentrantLockService;
    }

    @Override
    public void run() {
        reentrantLockService.testMethodA();
    }
}
