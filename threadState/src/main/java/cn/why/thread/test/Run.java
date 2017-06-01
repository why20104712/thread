package cn.why.thread.test;


import cn.why.thread.extthread.MyThread1;
import cn.why.thread.extthread.MyThread2;

public class Run {

	// NEW,
	// RUNNABLE,
	// TERMINATED,
	// BLOCKED,
	// WAITING,
	// TIMED_WAITING,

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("a");
		t1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		MyThread2 t2 = new MyThread2();
		t2.setName("b");
		System.out.println("main方法中的t2状态：" + t2.getState());
		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main方法中的t2状态：" + t2.getState());

	}
}
