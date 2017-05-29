package cn.why.thread.wait.notify.hold.lock.extthread;


import cn.why.thread.wait.notify.hold.lock.service.Service;

public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.syncNotifyMethod(lock);
	}

}
