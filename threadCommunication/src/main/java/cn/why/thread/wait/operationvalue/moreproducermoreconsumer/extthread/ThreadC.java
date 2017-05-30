package cn.why.thread.wait.operationvalue.moreproducermoreconsumer.extthread;


import cn.why.thread.wait.operationvalue.moreproducermoreconsumer.entity.C;

public class ThreadC extends Thread {

	private C r;

	public ThreadC(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.getValue();
		}
	}

}
