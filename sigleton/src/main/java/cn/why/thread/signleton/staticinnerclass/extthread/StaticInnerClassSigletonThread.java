package cn.why.thread.signleton.staticinnerclass.extthread;

import cn.why.thread.signleton.staticinnerclass.StaticInnerClassSigleton;

public class StaticInnerClassSigletonThread extends Thread{

    @Override
    public void run() {
        System.out.println(StaticInnerClassSigleton.getStaticInnerClassSigletonInstance().hashCode());
    }


}
