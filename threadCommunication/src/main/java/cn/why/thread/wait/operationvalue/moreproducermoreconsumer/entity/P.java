package cn.why.thread.wait.operationvalue.moreproducermoreconsumer.entity;

/**
 * 生产者
 *
 * @author why
 * @date 2017/5/30 13:32
 */
public class P {

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者 "
                            + Thread.currentThread().getName() + " WAITING了★");
                    lock.wait();
                }

                System.out.println("生产者 " + Thread.currentThread().getName()
                        + " RUNNABLE了");
                String value = System.currentTimeMillis() + "_"
                        + System.nanoTime();
                ValueObject.value = value;
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
