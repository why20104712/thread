package cn.why.thread.signleton.hungry;

/**
 * 饿汉单例模式
 * 体现急迫性，着急要，也就是使用类的时候，已经将对象创建好了
 * @author why
 * @date 2017/6/1 17:46
 */
public class HungrySigleton {


    /**
     * 饿汉单例模式
     * 立即加载
     * 体现急迫性，着急要，也就是使用类的时候，已经将对象创建好了
     * 标准的答案!饿汉式没有线程安全问题，懒汉式需要双重锁定解决可能的线程安全问题。
     * 饿汉式的缺点是类一加载就实例化，提前占用系统资源
     */
    private static HungrySigleton hungrySigleton = new HungrySigleton();


    private HungrySigleton() {

    }



    public static HungrySigleton getHungrySigletonInstance() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return hungrySigleton;
    }



}
