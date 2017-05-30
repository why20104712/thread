package cn.why.thread.wait.operationvalue.oneproduceroneconsumer.test;


import cn.why.thread.wait.operationvalue.oneproduceroneconsumer.entity.C;
import cn.why.thread.wait.operationvalue.oneproduceroneconsumer.entity.P;
import cn.why.thread.wait.operationvalue.oneproduceroneconsumer.extthread.ThreadC;
import cn.why.thread.wait.operationvalue.oneproduceroneconsumer.extthread.ThreadP;

public class Run {

    public static void main(String[] args) {

        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(r);

        pThread.start();
        rThread.start();
    }

}
