package com.why.thread.extthread;

import com.why.thread.service.ReentrantLockService;

public class ReentrantLockThread extends Thread {

    private ReentrantLockService reentrantLockService;

    public ReentrantLockThread(ReentrantLockService reentrantLockService) {
        this.reentrantLockService = reentrantLockService;
    }

    @Override
    public void run() {
        reentrantLockService.testMethod();
    }
}
