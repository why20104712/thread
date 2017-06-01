package cn.why.thread.signleton.hungry.extthread;

import cn.why.thread.signleton.hungry.HungrySigleton;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(HungrySigleton.getHungrySigletonInstance().hashCode());
    }
}
