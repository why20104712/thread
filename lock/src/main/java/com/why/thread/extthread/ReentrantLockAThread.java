package com.why.thread.extthread;

import com.why.thread.service.ReentrantLockService;

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
