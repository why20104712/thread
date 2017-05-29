package cn.why.thread.wait;

/**
 * 发出通知的线程，目前只有一个等待的线程和一个通知线程
 *
 * @author why
 * @date 2017/5/29 21:36
 */
public class NotifyThread extends Thread {

    private Object object;

    public NotifyThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        synchronized (object) {
            System.out.println("begin notify time = " + System.currentTimeMillis());
            object.notify();
            System.out.println("end notify time = " + System.currentTimeMillis());
        }

    }
}
