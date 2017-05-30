package cn.why.thread.wait.interrupted.test;


import cn.why.thread.wait.interrupted.extthread.ThreadA;

/**
 * 测试wait遇到interrupt
 */
public class Test {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
