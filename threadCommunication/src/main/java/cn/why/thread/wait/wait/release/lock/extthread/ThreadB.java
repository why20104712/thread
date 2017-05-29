package cn.why.thread.wait.wait.release.lock.extthread;


import cn.why.thread.wait.wait.release.lock.service.Service;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
