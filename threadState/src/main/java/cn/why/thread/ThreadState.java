package cn.why.thread;

/**
 * 测试线程的几种状态
 * @author why
 * @date 2017/6/1 22:31
 */
public class ThreadState extends Thread {

    public ThreadState() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + "======线程在构造方法中的状态是：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + "======线程在run方法中的状态是：" + Thread.currentThread().getState());
    }
}
