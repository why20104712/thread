package cn.why.thread.threadlocal;

public class ThreadLocalDefaultValue<T> extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "why2010";
    }
}
