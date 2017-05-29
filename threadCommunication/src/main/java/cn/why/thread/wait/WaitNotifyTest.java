package cn.why.thread.wait;

/**
 * 等待通知测试
 *
 * @author why
 * @date 2017/5/29 21:40
 */
public class WaitNotifyTest {


    public static void main(String[] args) {


        try {
            Object object = new Object();
            WaitThread waitThread = new WaitThread(object);
            waitThread.start();
            Thread.sleep(2000);
            Notifyhread notifyhread = new Notifyhread(object);
            notifyhread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
