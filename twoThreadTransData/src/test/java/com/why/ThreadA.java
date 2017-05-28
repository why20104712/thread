package com.why;

public class ThreadA extends Thread {

    private MyList myList;

    public ThreadA(MyList myList) {
        super();
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                myList.add();
                System.out.println("list添加了" + (i + 1) + "元素");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
