package cn.why.thread.signleton.lazy;

/**
 * 懒汉单例模式
 * 使用同步代码块方式，单重锁定，解决非线程安全问题（未成功解决），只有一重判断，有线程安全问题
 * 出于提高效率的目的，但是却没有成功解救非线程安全问题
 *
 * @author why
 * @date 2017/6/1 17:46
 */
public class LazySyncBlockOneLockSigleton {

    private static LazySyncBlockOneLockSigleton lazySyncBlockOneLockSigleton;


    private LazySyncBlockOneLockSigleton() {

    }


    public static LazySyncBlockOneLockSigleton getLazySyncBlockOneLockSigletonInstance() {

        try {
            /**
             * 模拟在创建对象之前做一些准备性的工作
             * 线程在这睡眠 2秒后，分别创建了对象，因为每个线程进来的时候，都是null
             * 这就是非线程安全问题
             */
            // 此种写法等同于：
            // synchronized public static LazySyncBlockOneLockSigleton getLazySyncBlockOneLockSigletonInstance()
            // 的写法，效率一样很低，全部代码被上锁,这样可以解决非线程安全问题
//            synchronized (LazySyncBlockOneLockSigleton.class) {
//                if (null == lazySyncBlockOneLockSigleton) {
//                    Thread.sleep(2000);
//                    lazySyncBlockOneLockSigleton = new LazySyncBlockOneLockSigleton();
//                }
//            }
            if (null == lazySyncBlockOneLockSigleton) {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(2000);
                // 使用synchronized (LazySyncBlockOneLockSigleton.class)
                // 虽然部分代码被上锁
                // 但还是有非线程安全问题
                synchronized (LazySyncBlockOneLockSigleton.class) {
                    lazySyncBlockOneLockSigleton = new LazySyncBlockOneLockSigleton();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return lazySyncBlockOneLockSigleton;
    }


}
