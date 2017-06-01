package cn.why.thread;

import cn.why.thread.service.Service;

/**
 * 测试线程的几种状态
 * @author why
 * @date 2017/6/1 22:31
 */
public class ThreadState extends Thread {

    private Service service;

    public ThreadState(Service service) {
        this.service = service;
    }

    public ThreadState() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + "======线程在构造方法中的状态是：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + "======线程在run方法中的状态是：" + Thread.currentThread().getState());


//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        if (null == service) {
            service = new Service();
        }
        service.testBlockState();

    }




}
