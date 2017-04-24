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

//        InstanceVariableSync instanceVariableSync = new InstanceVariableSync();
//        InstanceVariableSyncThreadA instanceVariableSyncThreadA = new InstanceVariableSyncThreadA(instanceVariableSync);
//        instanceVariableSyncThreadA.start();
//
//        InstanceVariableSyncThreadB instanceVariableSyncThreadB = new InstanceVariableSyncThreadB(instanceVariableSync);
//        instanceVariableSyncThreadB.start();


        /**
         * 先打印b=200,说明是异步的，同步的话，应该先打印a=100
         * 多个对象多个锁
         */
//        new ThreadA(new TwoObjectTwoLock()).start();
//        new ThreadB(new TwoObjectTwoLock()).start();

        /**
         * synchronized方法与锁对象
         * A线程先获取myObject对象的lock锁，B线程访问myObject对象同步的方法，需要等待，B线程访问myObject对象非同步的方法，不用等待
         */
//        MyObject myObject = new MyObject();
//        ThreadA threadA = new ThreadA(myObject);
//        threadA.setName("A");
//        ThreadB threadB = new ThreadB(myObject);
//        threadB.setName("B");
//        threadA.start();
//        threadB.start();


//        PublicVar publicVar = new PublicVar();
//        ThreadA threadA = new ThreadA(publicVar);
//        threadA.start();
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        /**
         * 在取值之前，已经被别的线程修改过，造成脏读
         * 脏读一定出现在操作实例变量的情况下，这是不同线程争抢实例变量的结果
         * 解决办法：在获取值的方法上加synchronized关键字
         */
//        publicVar.getValue();


        /**
         * 可重入锁测试
         */
        service();

    }

    public static void service() {
        ThreadA threadA = new ThreadA();
        threadA.start();
    }

}
