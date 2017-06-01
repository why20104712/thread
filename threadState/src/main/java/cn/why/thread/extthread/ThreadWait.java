package cn.why.thread.extthread;

import cn.why.thread.service.Lock;

public class ThreadWait extends Thread {

    @Override
    public void run() {

        synchronized (Lock.lock) {
            try {
                Lock.lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
