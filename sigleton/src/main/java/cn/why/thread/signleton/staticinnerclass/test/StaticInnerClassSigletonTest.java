package cn.why.thread.signleton.staticinnerclass.test;

import cn.why.thread.signleton.staticinnerclass.extthread.StaticInnerClassSigletonThread;

/**
 * 使用静态内部类方式实现单例模式
 * @author why
 * @date 2017/6/1 21:09
 */
public class StaticInnerClassSigletonTest {


    public static void main(String[] args) {
        StaticInnerClassSigletonThread staticInnerClassSigletonThread = new StaticInnerClassSigletonThread();

        Thread thread1 = new Thread(staticInnerClassSigletonThread);
        Thread thread2 = new Thread(staticInnerClassSigletonThread);
        Thread thread3 = new Thread(staticInnerClassSigletonThread);


        thread1.start();
        thread2.start();
        thread3.start();

    }
}
