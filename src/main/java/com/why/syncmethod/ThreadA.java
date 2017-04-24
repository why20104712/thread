package com.why.syncmethod;

/**
 * 非线程安全问题出现在实例变量中，如果某个方法的私有变量，则不存在非线程安全问题
 * @author why
 * @date 2017/4/21 16:02
 */
public class ThreadA extends Thread{

    private TwoObjectTwoLock twoObjectTwoLock;

    private MyObject myObject;

    private PublicVar publicVar;

    public ThreadA(){}

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    public ThreadA(TwoObjectTwoLock twoObjectTwoLock) {
        this.twoObjectTwoLock = twoObjectTwoLock;
    }

    @Override
    public void run() {
        super.run();
//        twoObjectTwoLock.addNum("a");

//        myObject.methodA();
//        publicVar.setValue("B", "BB");

//        Service service = new Service();
//        service.service1();

        Sub sub = new Sub();
        sub.operationSubMethod();

    }

}
