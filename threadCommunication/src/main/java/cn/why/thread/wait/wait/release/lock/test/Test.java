package cn.why.thread.wait.wait.release.lock.test;


import cn.why.thread.wait.wait.release.lock.extthread.ThreadA;
import cn.why.thread.wait.wait.release.lock.extthread.ThreadB;

public class Test {

	public static void main(String[] args) {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

	}

}
