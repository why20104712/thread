package cn.why.thread.threadlocal.test;


import cn.why.thread.threadlocal.ext.ThreadLocalExt;

public class Run {
	public static ThreadLocalExt tl = new ThreadLocalExt();

	public static void main(String[] args) {
		if (tl.get() == null) {
			System.out.println("wwwwֵ");
			tl.set("setֵ");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
