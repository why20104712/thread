package cn.why.thread.join;

/**
 * 测试
 * @author why
 * @date 2017/5/31 15:24
 */
public class Run {


    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());

        thread.start();

        try {
            System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 执行开始时间：" + System.currentTimeMillis());
            /**
             * 若子线程睡眠的时间比join设置的时间还久，已join设置的时间为准，进行返回，这会导致子线程还未执行完
             */
            thread.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这段代码需要子线程执行完成后在执行");
        System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 执行结束时间：" + System.currentTimeMillis());


    }

}
