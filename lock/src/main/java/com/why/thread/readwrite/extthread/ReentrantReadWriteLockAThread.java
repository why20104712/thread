package com.why.thread.readwrite.extthread;

import com.why.thread.readwrite.service.ReentrantReadWriteLockService;

public class ReentrantReadWriteLockAThread extends Thread {


    private ReentrantReadWriteLockService reentrantReadWriteLockService;

    public ReentrantReadWriteLockAThread(ReentrantReadWriteLockService reentrantReadWriteLockService) {
        this.reentrantReadWriteLockService = reentrantReadWriteLockService;
    }

    @Override
    public void run() {
        reentrantReadWriteLockService.read();
        reentrantReadWriteLockService.write();
    }
}
