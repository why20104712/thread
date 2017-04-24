package com.why.syncmethod;

/**
 * 多线程设置值的时候使用同步方法，但是取值的时候，可能出现脏读（取到的值是别的线程修改的值）
 * @author why
 * @date 2017/4/24 11:34
 */
public class PublicVar {


    public String username = "A";

    public String password = "AA";


    public synchronized void setValue(String username, String password) {

        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void getValue() {
        System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
    }

}
