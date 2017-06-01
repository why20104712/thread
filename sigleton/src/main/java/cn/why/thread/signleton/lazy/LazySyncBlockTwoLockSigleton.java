package cn.why.thread.signleton.lazy;

/**
 * 懒汉单例模式
 * 使用双检测机制来解决问题
 *
 * @author why
 * @date 2017/6/1 17:46
 */
public class LazySyncBlockTwoLockSigleton {

    private static LazySyncBlockTwoLockSigleton lazySyncBlockTwoLockSigleton;


    private LazySyncBlockTwoLockSigleton() {

    }

    // 此版本的代码称为：
    // 双重检查Double-Check Locking
    public static LazySyncBlockTwoLockSigleton getLazySyncBlockTwoLockSigletonInstance() {

        try {
            /**
             * 推荐使用这种写法
             */
            if (null != lazySyncBlockTwoLockSigleton) {
            }else {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(2000);
                synchronized (LazySyncBlockTwoLockSigleton.class) {
                    if (null == lazySyncBlockTwoLockSigleton) {
                        lazySyncBlockTwoLockSigleton = new LazySyncBlockTwoLockSigleton();
                    }
                }
            }


            /**
             * 这种写法不正确，不推荐这种写法，
             * 双重判断这种写法等同于在方法上加synchroizd
             */
//            if (null == lazySyncBlockTwoLockSigleton) {
//                Thread.sleep(2000);
//                synchronized (LazySyncBlockTwoLockSigleton.class) {
//                    if (null == lazySyncBlockTwoLockSigleton) {
//                        lazySyncBlockTwoLockSigleton = new LazySyncBlockTwoLockSigleton();
//                    }
//                }
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return lazySyncBlockTwoLockSigleton;
    }


}
