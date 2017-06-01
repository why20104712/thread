package cn.why.thread.signleton.staticinnerclass;

/**
 * 使用静态内部类实现单例模式
 * @author why
 * @date 2017/6/1 21:03
 */
public class StaticInnerClassSigleton {


    private static class StaticInnerClass{


        private static StaticInnerClassSigleton staticInnerClassSigleton = new StaticInnerClassSigleton();

    }


    private StaticInnerClassSigleton() {

    }


    public static StaticInnerClassSigleton getStaticInnerClassSigletonInstance() {
        return StaticInnerClass.staticInnerClassSigleton;
    }

}
