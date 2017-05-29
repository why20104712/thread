package cn.why.thread.wait.notify.hold.lock.extthread;


import cn.why.thread.wait.notify.hold.lock.service.Service;

public class ThreadA extends Thread {
	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.syncWaitMethod(lock);
	}

}
