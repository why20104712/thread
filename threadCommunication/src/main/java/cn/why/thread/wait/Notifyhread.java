package cn.why.thread.wait;

/**
 * 等待的线程，需要被通知的线程
 * @author why
 * @date 2017/5/29 21:36
 */
public class Notifyhread extends Thread {

    private Object object;

    public Notifyhread(Object object) {
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
