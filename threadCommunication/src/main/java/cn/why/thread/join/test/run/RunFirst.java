package cn.why.thread.join.test.run;


import cn.why.thread.join.extthread.ThreadA;
import cn.why.thread.join.extthread.ThreadB;

public class RunFirst {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		b.start();
		System.out.println("   main end=" + System.currentTimeMillis());
	}

}
