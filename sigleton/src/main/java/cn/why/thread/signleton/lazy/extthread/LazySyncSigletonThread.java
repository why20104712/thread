package cn.why.thread.signleton.lazy.extthread;

import cn.why.thread.signleton.lazy.LazySyncSigleton;

/**
 * 懒汉单例模式线程
 * 使用synchorized方法解决非线程安全问题
 * 这种方式效率最低，获取对象方法都被锁住了
 * @author why
 * @date 2017/6/1 18:18
 */
public class LazySyncSigletonThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySyncSigleton.getLazySyncSigletonInstance().hashCode());
    }


}
