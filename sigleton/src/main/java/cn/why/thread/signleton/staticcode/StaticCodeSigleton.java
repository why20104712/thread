package cn.why.thread.signleton.staticcode;

/**
 * 使用静态内部类实现单例模式
 *
 * @author why
 * @date 2017/6/1 21:03
 */
public class StaticCodeSigleton {


    private static StaticCodeSigleton staticCodeSigleton;

    static {
        staticCodeSigleton = new StaticCodeSigleton();
    }

    private StaticCodeSigleton() {

    }

    public static StaticCodeSigleton getStaticCodeSigletonInstance() {
        return staticCodeSigleton;
    }

}
