package com.why.thread.extthread;

import com.why.thread.service.ReentrantLockService;

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
