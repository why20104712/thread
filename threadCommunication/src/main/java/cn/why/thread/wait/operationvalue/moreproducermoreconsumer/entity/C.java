package cn.why.thread.wait.operationvalue.moreproducermoreconsumer.entity;

/**
 * 消费者
 * @author why
 * @date 2017/5/30 13:36
 */
public class C {

    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者 "
                            + Thread.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName()
                        + " RUNNABLE了");
                ValueObject.value = "";
//                lock.notify();
                /**
                 * 避免假死
                 */
                lock.notifyAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
