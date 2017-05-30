package cn.why.thread.wait.operationvalue.oneproduceroneconsumer.extthread;


import cn.why.thread.wait.operationvalue.oneproduceroneconsumer.entity.C;

public class ThreadC extends Thread {

    private C r;

    public ThreadC(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }

}
