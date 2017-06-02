package condition.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Condition实现等待/通知模式
 * @author why
 * @date 2017/6/2 21:56
 */
public class ConditionService {


    private ReentrantLock reentrantLock = new ReentrantLock();

    private Condition condition = reentrantLock.newCondition();

    /**
     * 等待
     */
    public void await() {

        try {
            reentrantLock.lock();
            System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 当前时间：" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
            System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 锁释放了");
        }

    }

    /**
     * 通知
     */
    public void signal() {

        try {
            reentrantLock.lock();
            System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 当前时间：" + System.currentTimeMillis());
            condition.signal();
        } finally {
            reentrantLock.unlock();
            System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 锁释放了");
        }


    }

}
