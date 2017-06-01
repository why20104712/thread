package cn.why.thread.signleton.lazy.test;

import cn.why.thread.signleton.lazy.extthread.LazySyncBlockTwoLockSigletonThread;

/**
 * 懒汉单例模式测试
 * 使用双检测机制来解决问题
 * @author why
 * @date 2017/6/1 18:20
 */
public class LazySyncBlockTwoLockSigletonTest {

    public static void main(String[] args) {
        LazySyncBlockTwoLockSigletonThread lazySyncBlockTwoLockSigletonThread = new LazySyncBlockTwoLockSigletonThread();

        Thread thread1 = new Thread(lazySyncBlockTwoLockSigletonThread);
        Thread thread2 = new Thread(lazySyncBlockTwoLockSigletonThread);
        Thread thread3 = new Thread(lazySyncBlockTwoLockSigletonThread);


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
