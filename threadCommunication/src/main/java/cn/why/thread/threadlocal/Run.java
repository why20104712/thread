package cn.why.thread.threadlocal;

public class Run {


    public static void main(String[] args) {


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                ThreadLocalOperation.setValue();
//                ThreadLocalOperation.getValue();
//            }
//        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocalOperation.getValue();
            }
        }).start();

    }
}
