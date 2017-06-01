package cn.why.thread.signleton.staticcode.extthread;

import cn.why.thread.signleton.staticcode.StaticCodeSigleton;

public class StaticCodeSigletonThread extends Thread{

    @Override
    public void run() {
        System.out.println(StaticCodeSigleton.getStaticCodeSigletonInstance().hashCode());
    }


}
