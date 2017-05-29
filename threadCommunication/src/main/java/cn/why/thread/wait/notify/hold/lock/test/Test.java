package cn.why.thread.wait.notify.hold.lock.test;


import cn.why.thread.wait.notify.hold.lock.extthread.NotifyThread;
import cn.why.thread.wait.notify.hold.lock.extthread.ThreadA;
import cn.why.thread.wait.notify.hold.lock.extthread.SynNotifyMethodThread;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

		SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
		c.start();

	}

}
