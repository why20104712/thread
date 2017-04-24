package com.why.syncmethod;

/**
 * 多个对象多个锁的问题，非线程安全问题，是多个线程操作同一个对象引发的情况，不同的锁锁在不同的对象上，还是会有非线程安全问题
 * @author why
 * @date 2017/4/21 16:32
 */
public class TwoObjectTwoLock {

    /**
     * 实例变量
     */
    private int num = 0;
    public synchronized void addNum(String username) {


        if (username.equals("a")) {
            num =100;
            System.out.println("a set is over");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



        if (username.equals("b")) {
            num = 200;
            System.out.println("b set is over");
        }


        /**
         * 在A线程睡眠的时候，B线程修改了实例变量的值，所有会存在非线程安全问题
         */
        System.out.println(username + " = " + num);

    }

}
