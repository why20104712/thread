package cn.why.thread.signleton.hungry.test;

import cn.why.thread.signleton.hungry.extthread.MyThread;

public class HungrySigletonTest {


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
