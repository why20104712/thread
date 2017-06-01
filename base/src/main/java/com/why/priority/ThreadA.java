package com.why.priority;

/**
 * 测试线程优先级的继承特性
 * A启动B线程，那B线程和A具备相同的优先级
 * @author why
 * @date 2017/4/7 15:49
 */
public class ThreadA extends Thread {


    @Override
    public void run() {
        super.run();
        ThreadB threadB = new ThreadB();
        threadB.start();
        System.out.println("线程A的优先级：" + Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority());
    }
}
