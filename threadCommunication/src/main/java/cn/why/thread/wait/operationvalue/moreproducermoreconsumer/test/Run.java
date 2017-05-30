package cn.why.thread.wait.operationvalue.moreproducermoreconsumer.test;


import cn.why.thread.wait.operationvalue.moreproducermoreconsumer.entity.C;
import cn.why.thread.wait.operationvalue.moreproducermoreconsumer.entity.P;
import cn.why.thread.wait.operationvalue.moreproducermoreconsumer.extthread.ThreadC;
import cn.why.thread.wait.operationvalue.moreproducermoreconsumer.extthread.ThreadP;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");

        P p = new P(lock);
        C r = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] rThread = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i + 1));

            rThread[i] = new ThreadC(r);
            rThread[i].setName("消费者" + (i + 1));

            pThread[i].start();
            rThread[i].start();
        }

        Thread.sleep(5000);

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];

        Thread.currentThread().getThreadGroup().enumerate(threadArray);

        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }

//        main RUNNABLE
//        生产者1 WAITING
//        消费者1 WAITING
//        生产者2 WAITING
//        消费者2 WAITING

        /**
         * 线程通知了同类，所以假死了，生产者通知生产者了
         */

    }

}
