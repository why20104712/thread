package cn.why.thread.wait.operationvalue.oneproduceroneconsumer.extthread;


import cn.why.thread.wait.operationvalue.oneproduceroneconsumer.entity.P;

public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }

}
