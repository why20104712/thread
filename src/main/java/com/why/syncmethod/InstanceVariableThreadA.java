package com.why.syncmethod;

/**
 * 非线程安全问题出现在实例变量中，如果某个方法的私有变量，则不存在非线程安全问题
 * @author why
 * @date 2017/4/21 16:02
 */
public class InstanceVariableThreadA  extends Thread{

    private InstanceVariable instanceVariable;

    public InstanceVariableThreadA(InstanceVariable instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    @Override
    public void run() {
        super.run();
        instanceVariable.addNum("a");
    }

}
