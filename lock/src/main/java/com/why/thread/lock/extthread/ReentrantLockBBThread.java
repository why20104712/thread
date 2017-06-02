package com.why.thread.lock.extthread;

import com.why.thread.lock.service.ReentrantLockService;

public class ReentrantLockBBThread extends Thread {

    private ReentrantLockService reentrantLockService;

    public ReentrantLockBBThread(ReentrantLockService reentrantLockService) {
        this.reentrantLockService = reentrantLockService;
    }

    @Override
    public void run() {
        reentrantLockService.testMethodB();
    }
}
