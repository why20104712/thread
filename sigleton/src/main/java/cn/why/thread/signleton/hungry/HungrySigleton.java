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
     * 体现急迫性，着急要，也就是使用类的时候，已经将对象创建好了
     */
    private static HungrySigleton hungrySigleton = new HungrySigleton();


    private HungrySigleton() {

    }



    public static HungrySigleton getHungrySigletonInstance() {
        return hungrySigleton;
    }



}
