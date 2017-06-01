package cn.why.thread.signleton.lazy;

/**
 * 懒汉单例模式
 * 延迟加载
 * 体现不急迫，能延迟到什么时候创建对象，就什么时候创建，要多懒有多懒，用到的时候在创建，也就是使用类的时候，在创建对象
 * 存在非线程安全问题
 * @author why
 * @date 2017/6/1 17:46
 */
public class LazySigleton {


    /**
     * 懒汉单例模式
     * 体现不急迫，能延迟到什么时候创建对象，就什么时候创建，要多懒有多懒，用到的时候在创建，也就是使用类的时候，在创建对象
     */
    private static LazySigleton lazySigleton;


    private LazySigleton() {

    }


    public static LazySigleton getLazySigletonInstance() {

        if (null == lazySigleton) {
            try {
                /**
                 * 线程在这睡眠 2秒后，分别创建了对象，因为每个线程进来的时候，都是null
                 * 这就是非线程安全问题
                 */
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lazySigleton = new LazySigleton();
        }

        return lazySigleton;
    }



}
