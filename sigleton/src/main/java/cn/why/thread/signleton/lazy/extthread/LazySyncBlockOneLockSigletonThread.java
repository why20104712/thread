package cn.why.thread.signleton.lazy.extthread;

import cn.why.thread.signleton.lazy.LazySyncBlockOneLockSigleton;

/**
 * 懒汉单例模式线程
 * 使用synchorized代码块方法解决非线程安全问题，只有一重判断，有线程安全问题
 * 这种方式效率最低，获取对象方法代码都被锁住了
 * @author why
 * @date 2017/6/1 18:18
 */
public class LazySyncBlockOneLockSigletonThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySyncBlockOneLockSigleton.getLazySyncBlockOneLockSigletonInstance().hashCode());
    }


}
