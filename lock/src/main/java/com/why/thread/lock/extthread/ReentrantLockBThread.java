package com.why.thread.lock.extthread;

import com.why.thread.lock.service.ReentrantLockService;

public class ReentrantLockBThread extends Thread {

    private ReentrantLockService reentrantLockService;

    public ReentrantLockBThread(ReentrantLockService reentrantLockService) {
        this.reentrantLockService = reentrantLockService;
    }

    @Override
    public void run() {
        reentrantLockService.testMethodB();
    }
}
