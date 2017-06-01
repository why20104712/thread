package com.why.syncmethod;

/**
 * 非线程安全问题出现在实例变量中，如果某个方法的私有变量，则不存在非线程安全问题
 * @author why
 * @date 2017/4/21 16:02
 */
public class InstanceVariable {

    /**
     * 实例变量
     */
    private int num = 0;
    public void addNum(String username) {


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
