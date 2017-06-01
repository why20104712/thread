package cn.why.thread.signleton.lazy.extthread;

import cn.why.thread.signleton.lazy.LazySigleton;

/**
 * 懒汉单例模式线程
 * 测试懒汉模式存在非线程安全问题
 * @author why
 * @date 2017/6/1 18:18
 */
public class LazySigletonThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySigleton.getLazySigletonInstance().hashCode());
    }


}
