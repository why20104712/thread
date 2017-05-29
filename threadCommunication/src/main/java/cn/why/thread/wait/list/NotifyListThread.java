package cn.why.thread.wait.list;

/**
 * 发出通知的线程，目前只有一个等待的线程和一个通知线程
 *
 * @author why
 * @date 2017/5/29 21:36
 */
public class NotifyListThread extends Thread {

    private Object object;

    public NotifyListThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        try {
            synchronized (object) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        object.notify();
                        System.out.println("已发出通知！");
                    }
                    System.out.println("MyList添加了" + (i + 1) + "个元素!");

                    /**
                     * 不建议这样写，容易死锁，或者别的一场情况
                     */
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
