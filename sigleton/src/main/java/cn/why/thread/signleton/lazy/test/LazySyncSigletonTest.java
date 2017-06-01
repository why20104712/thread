package cn.why.thread.signleton.lazy.test;

import cn.why.thread.signleton.lazy.extthread.LazySyncSigletonThread;

/**
 * 懒汉单例模式测试
 * 使用synchorized方法解决非线程安全问题
 * 这种方式效率最低
 * @author why
 * @date 2017/6/1 18:20
 */
public class LazySyncSigletonTest {

    public static void main(String[] args) {
        LazySyncSigletonThread lazySyncSigletonThread = new LazySyncSigletonThread();

        Thread thread1 = new Thread(lazySyncSigletonThread);
        Thread thread2 = new Thread(lazySyncSigletonThread);
        Thread thread3 = new Thread(lazySyncSigletonThread);


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
