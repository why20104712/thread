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

}
