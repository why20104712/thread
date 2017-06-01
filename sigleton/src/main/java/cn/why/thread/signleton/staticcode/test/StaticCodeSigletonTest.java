package cn.why.thread.signleton.staticcode.test;

import cn.why.thread.signleton.staticcode.extthread.StaticCodeSigletonThread;

/**
 * 使用静态代码方式实现单例模式
 * @author why
 * @date 2017/6/1 21:09
 */
public class StaticCodeSigletonTest {


    public static void main(String[] args) {
        StaticCodeSigletonThread staticCodeSigletonThread = new StaticCodeSigletonThread();

        Thread thread1 = new Thread(staticCodeSigletonThread);
        Thread thread2 = new Thread(staticCodeSigletonThread);
        Thread thread3 = new Thread(staticCodeSigletonThread);


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
