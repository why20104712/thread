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
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这段代码需要子线程执行完成后在执行");


    }

}
