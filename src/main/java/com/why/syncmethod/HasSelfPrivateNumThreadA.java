package com.why.syncmethod;

/**
 * 控制方法内的私有变量的线程
 * @author why
 * @date 2017/4/21 16:07
 */
public class HasSelfPrivateNumThreadA extends Thread{


    private HasSelfPrivateNum hasSelfPrivateNum;


    public HasSelfPrivateNumThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addNum("a");
    }
}
