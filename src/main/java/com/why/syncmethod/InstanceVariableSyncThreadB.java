package com.why.syncmethod;

/**
 * 非线程安全问题出现在实例变量中，如果某个方法的私有变量，则不存在非线程安全问题
 * @author why
 * @date 2017/4/21 16:02
 */
public class InstanceVariableSyncThreadB extends Thread{

    private InstanceVariableSync instanceVariableSync;

    public InstanceVariableSyncThreadB(InstanceVariableSync instanceVariableSync) {
        this.instanceVariableSync = instanceVariableSync;
    }

    @Override
    public void run() {
        super.run();
        instanceVariableSync.addNum("b");
    }

}
