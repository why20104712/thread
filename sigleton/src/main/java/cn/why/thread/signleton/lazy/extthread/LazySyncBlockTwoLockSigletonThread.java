package cn.why.thread.signleton.lazy.extthread;

import cn.why.thread.signleton.lazy.LazySyncBlockTwoLockSigleton;

/**
 * 懒汉单例模式线程
 * 双重验证
 * @author why
 * @date 2017/6/1 18:18
 */
public class LazySyncBlockTwoLockSigletonThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySyncBlockTwoLockSigleton.getLazySyncBlockTwoLockSigletonInstance().hashCode());
    }


}
