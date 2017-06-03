package com.why.thread.readwrite.extthread;

import com.why.thread.readwrite.service.ReentrantReadWriteLockService;

public class ReentrantReadWriteLockBThread extends Thread {


    private ReentrantReadWriteLockService reentrantReadWriteLockService;

    public ReentrantReadWriteLockBThread(ReentrantReadWriteLockService reentrantReadWriteLockService) {
        this.reentrantReadWriteLockService = reentrantReadWriteLockService;
    }

    @Override
    public void run() {
//        reentrantReadWriteLockService.readShare();
        reentrantReadWriteLockService.writeMutex();
    }
}
