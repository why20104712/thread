package cn.why.thread.wait;

/**
 * 主要是用于验证，调用wait方法锁(对象监视器)是必须的
 * @author why
 * @date 2017/5/29 21:14
 */
public class LockIsNecessary {


    public static void main(String[] args) {
        String str = new String("why");

        try {
            System.out.println("sync上面一行");
            synchronized (str) {
                System.out.println("wait第一行代码");
                str.wait(3000);
                System.out.println("wait了3秒之后，继续执行，代码执行到wait方法那行，不继续往下执行，等待被通知");
                str.wait();


                /**
                 * 若没有指定时间，下面的代码不会执行，除非有别的线程通知
                 * wait方法一般是锁对象调用，调用wait方法前，当前线程必须获取该对象的对象级别锁
                 */
//                str.wait();
//                str.notify();

                System.out.println("wait后的代码");
            }
            System.out.println("sync后面一行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }


}
