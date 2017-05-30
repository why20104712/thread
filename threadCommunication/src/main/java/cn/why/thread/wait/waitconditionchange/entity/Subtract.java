package cn.why.thread.wait.waitconditionchange.entity;


public class Subtract {

	private String lock;

	public Subtract(String lock) {
		super();
		this.lock = lock;
	}

	public void subtract() {
		try {
			synchronized (lock) {

				/**
				 * 使用while可以时时感知条件的变化
				 */
//				while ()ValueObject.list.size() == 0) {
				/**
				 * 若使用if，当条件发生变化，不能时时感知，导致出现异常
				 */
				if (ValueObject.list.size() == 0) {
					System.out.println("wait begin ThreadName="
							+ Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait   end ThreadName="
							+ Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size=" + ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
