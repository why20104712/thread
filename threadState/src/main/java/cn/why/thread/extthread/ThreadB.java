package cn.why.thread.extthread;

import cn.why.thread.service.Service;

/**
 * 测试线程的几种状态
 * @author why
 * @date 2017/6/1 22:31
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        Service.testBlockState();
    }

}
