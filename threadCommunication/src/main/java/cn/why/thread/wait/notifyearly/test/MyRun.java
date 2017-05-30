package cn.why.thread.wait.notifyearly.test;

public class MyRun {

	private String lock = new String("");
	private boolean isFirstRunB = false;


	/**
	 * 等待线程
	 */
	private Runnable runnableA = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized (lock) {
					while (isFirstRunB == false) {
						System.out.println("begin wait");
						lock.wait();
						System.out.println("end wait");
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	/**
	 * 通知线程
	 */
	private Runnable runnableB = new Runnable() {
		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("begin notify");
				lock.notify();
				System.out.println("end notify");
				isFirstRunB = true;

			}
		}
	};

	public static void main(String[] args) throws InterruptedException {

		MyRun run = new MyRun();

		/**
		 * 通知过早
		 */
		Thread b = new Thread(run.runnableB);
		b.start();

		Thread.sleep(100);

		Thread a = new Thread(run.runnableA);
		a.start();

	}

}
