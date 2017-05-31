package cn.why.thread.threadlocal.ext;

public class ThreadLocalExt<T> extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return "why201001010";
	}



}
