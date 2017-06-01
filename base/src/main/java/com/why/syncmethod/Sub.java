package com.why.syncmethod;

/**
 * 子类，继承MainParent
 */
public class Sub extends MainParent {

    public synchronized void operationSubMethod() {

        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(1000);
                operationMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     * 演示同步不继承
     */
//    public synchronized void subMethod() {
    public void subMethod() {

        try {
            System.out.println("int sub next step sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("int sub next step sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.mainMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
