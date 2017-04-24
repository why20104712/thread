package com.why.syncmethod;

/**
 * 演示继承环境也可以锁重入
 *
 * @author why
 * @date 2017/4/24 13:36
 */
public class MainParent {


    public int i = 10;

    public synchronized void operationMainMethod() {

        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
