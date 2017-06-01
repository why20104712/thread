package cn.why.thread.extthread;


import cn.why.thread.service.MyService;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		MyService.serviceMethod();
	}

}
