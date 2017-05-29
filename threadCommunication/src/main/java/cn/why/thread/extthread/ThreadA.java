package cn.why.thread.extthread;


import cn.why.thread.mylist.MyList;

public class ThreadA extends Thread {

	private MyList list;

	public ThreadA(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
//				System.out.println("线程A运行中");
				list.add();
				System.out.println("list添加了" + (i + 1) + "个元素");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
