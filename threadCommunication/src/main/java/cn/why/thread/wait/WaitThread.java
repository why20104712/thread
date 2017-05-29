package cn.why.thread.wait;

/**
 * 等待的线程，需要被通知的线程
 * @author why
 * @date 2017/5/29 21:36
 */
public class WaitThread extends Thread {

    private Object object;

    public WaitThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        synchronized (object) {
            try {
                System.out.println("begin wait time = " + System.currentTimeMillis());
                object.wait();
                System.out.println("end wait time = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
