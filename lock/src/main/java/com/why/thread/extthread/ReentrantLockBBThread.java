package com.why.thread.extthread;

import com.why.thread.service.ReentrantLockService;

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
