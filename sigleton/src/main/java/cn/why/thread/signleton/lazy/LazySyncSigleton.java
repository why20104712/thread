package cn.why.thread.signleton.lazy;

/**
 * 懒汉单例模式
 * 使用synchorized方法解决非线程安全问题
 * 这种方式效率最低
 *
 * @author why
 * @date 2017/6/1 17:46
 */
public class LazySyncSigleton {


    /**
     * 懒汉单例模式
     * 体现不急迫，能延迟到什么时候创建对象，就什么时候创建，要多懒有多懒，用到的时候在创建，也就是使用类的时候，在创建对象
     */
    private static LazySyncSigleton lazySyncSigleton;


    private LazySyncSigleton() {

    }


    public synchronized static LazySyncSigleton getLazySyncSigletonInstance() {

        try {
            /**
             * 模拟在创建对象之前做一些准备性的工作
             * 线程在这睡眠 2秒后，分别创建了对象，因为每个线程进来的时候，都是null
             * 这就是非线程安全问题
             */
            if (null == lazySyncSigleton) {
                Thread.sleep(2000);
                lazySyncSigleton = new LazySyncSigleton();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return lazySyncSigleton;
    }


}
