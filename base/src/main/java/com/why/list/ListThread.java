package com.why.list;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * list线程，往list里放100个对象
 * @author why
 * @date 2017/4/7 13:44
 */
public class ListThread extends Thread {


    private List list;

    private CountDownLatch countDownLatch;

    public ListThread(List list, CountDownLatch countDownLatch) {
        this.list = list;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            list.add(new Object());
        }
        countDownLatch.countDown();
    }
}
