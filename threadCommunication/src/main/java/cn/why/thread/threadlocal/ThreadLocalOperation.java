package cn.why.thread.threadlocal;

/**
 * 每个线程都有自己独立的线程副本变量
 * 主要用于解决线程的变量隔离
 */
public class ThreadLocalOperation extends ThreadLocal{


    private static ThreadLocalDefaultValue<String> threadLocal = new ThreadLocalDefaultValue<>();

    public static void getValue() {
        String str = (String) threadLocal.get();
        if (null == str) {
            System.out.println("还未往ThreadLocal放置值");
        } else {
            System.out.println("从ThreadLocal获取到的值为："  + str);
        }

    }

    @Override
    protected Object initialValue() {
        return "why2010";
    }


    public static void setValue() {
        threadLocal.set("why");
        System.out.println("threadLocal设置值为why");
    }

}
