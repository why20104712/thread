package cn.why.thread.wait.waitconditionchange.extthread;


import cn.why.thread.wait.waitconditionchange.entity.Subtract;

public class ThreadSubtract extends Thread {

	private Subtract r;

	public ThreadSubtract(Subtract r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		r.subtract();
	}

}
