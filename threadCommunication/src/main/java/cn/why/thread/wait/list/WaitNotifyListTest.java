package cn.why.thread.wait.list;

/**
 * 等待通知测试
 *
 * @author why
 * @date 2017/5/29 21:40
 */
public class WaitNotifyListTest {


    public static void main(String[] args) {


        try {
            Object object = new Object();
            WaitListThread waitListThread = new WaitListThread(object);
            waitListThread.start();
            Thread.sleep(2000);
            NotifyListThread notifyListThread = new NotifyListThread(object);
            notifyListThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
