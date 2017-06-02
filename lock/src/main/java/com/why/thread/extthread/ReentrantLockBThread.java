package com.why.thread.extthread;

import com.why.thread.service.ReentrantLockService;

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
