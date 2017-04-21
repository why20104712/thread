package com.why.syncmethod;

/**
 * 测试线程
 * @author why
 * @date 2017/4/21 16:10
 */
public class Run {


    public static void main(String[] args) {

//        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
//
//        HasSelfPrivateNumThreadA hasSelfPrivateNumThreadA = new HasSelfPrivateNumThreadA(hasSelfPrivateNum);
//        hasSelfPrivateNumThreadA.start();
//
//        HasSelfPrivateNumThreadB hasSelfPrivateNumThreadB = new HasSelfPrivateNumThreadB(hasSelfPrivateNum);
//        hasSelfPrivateNumThreadB.start();


//        InstanceVariable instanceVariable = new InstanceVariable();
//        InstanceVariableThreadA instanceVariableThreadA = new InstanceVariableThreadA(instanceVariable);
//        instanceVariableThreadA.start();
//
//
//        InstanceVariableThreadB instanceVariableThreadB = new InstanceVariableThreadB(instanceVariable);
//        instanceVariableThreadB.start();

        InstanceVariableSync instanceVariableSync = new InstanceVariableSync();
        InstanceVariableSyncThreadA instanceVariableSyncThreadA = new InstanceVariableSyncThreadA(instanceVariableSync);
        instanceVariableSyncThreadA.start();

        InstanceVariableSyncThreadB instanceVariableSyncThreadB = new InstanceVariableSyncThreadB(instanceVariableSync);
        instanceVariableSyncThreadB.start();
    }
}
