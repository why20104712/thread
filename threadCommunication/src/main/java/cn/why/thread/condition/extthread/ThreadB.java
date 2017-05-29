package cn.why.thread.condition.extthread;


import cn.why.thread.condition.mylist.MyList;

public class ThreadB extends Thread {

	private MyList list;

	public ThreadB(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			if (true) {
//				System.out.println("线程B运行中");
				if (list.size() == 5) {
					System.out.println("==5,线程B要停止运行了");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
