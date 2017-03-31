package com.why.thread;

/**
 * 资源操作封装,通过锁机制进行资源访问控制
 *
 * @author why
 * @date 2017/3/20 21:36
 */
public class Operation {

    private Boolean lock = true;

    /**
     * 主线程操作40次
     */
    public synchronized void mainThreadOperation(int round) {

        while (!lock) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 40; i++) {
            System.out.println("主线程执行第" + round + "轮，第" + (i + 1) + "次");
        }
        System.out.println("=============================================");
        lock = false;
        this.notify();

    }


    /**
     * 子线程操作30次
     */
    public synchronized void childThreadOperation(int round) {

        while (lock) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 30; i++) {
            System.out.println("子线程执行第" + round + "轮，第" + (i + 1) + "次");
        }
        System.out.println("=============================================");
        lock = true;
        this.notify();

    }


}
