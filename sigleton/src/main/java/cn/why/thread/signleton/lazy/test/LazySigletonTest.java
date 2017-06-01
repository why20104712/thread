package cn.why.thread.signleton.lazy.test;

import cn.why.thread.signleton.lazy.extthread.LazySigletonThread;

/**
 * 懒汉单例模式测试
 * @author why
 * @date 2017/6/1 18:20
 */
public class LazySigletonTest {

    public static void main(String[] args) {
        LazySigletonThread lazySigletonThread = new LazySigletonThread();

        Thread thread1 = new Thread(lazySigletonThread);
        Thread thread2 = new Thread(lazySigletonThread);
        Thread thread3 = new Thread(lazySigletonThread);


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
