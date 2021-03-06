package com.why.thread;

/**
 * 测试类
 * 主线程和子线程轮流执行，子线程执行30次，子线程执行40次
 */
public class Test {

    public static void main(String[] args) {


        final ResourceOperation resourceOperation = new ResourceOperation();

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 50; i++) {
                    resourceOperation.childThreadOperation(i + 1);
                }

            }
        }).start();

        for (int i = 0; i < 50; i++) {
            resourceOperation.mainThreadOperation(i + 1);
        }

    }
}
