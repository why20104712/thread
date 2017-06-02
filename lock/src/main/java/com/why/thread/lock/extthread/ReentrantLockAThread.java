package com.why.thread.lock.extthread;

import com.why.thread.lock.service.ReentrantLockService;

public class ReentrantLockAThread extends Thread {

    private ReentrantLockService reentrantLockService;

    public ReentrantLockAThread(ReentrantLockService reentrantLockService) {
        this.reentrantLockService = reentrantLockService;
    }

    @Override
    public void run() {
        reentrantLockService.testMethodA();
    }
}
