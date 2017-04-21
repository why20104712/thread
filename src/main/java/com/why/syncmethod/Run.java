package com.why.syncmethod;

/**
 * 测试线程
 * @author why
 * @date 2017/4/21 16:10
 */
public class Run {


    public static void main(String[] args) {

        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();

        HasSelfPrivateNumThreadA hasSelfPrivateNumThreadA = new HasSelfPrivateNumThreadA(hasSelfPrivateNum);
        hasSelfPrivateNumThreadA.start();

        HasSelfPrivateNumThreadB hasSelfPrivateNumThreadB = new HasSelfPrivateNumThreadB(hasSelfPrivateNum);
        hasSelfPrivateNumThreadB.start();

    }
}
