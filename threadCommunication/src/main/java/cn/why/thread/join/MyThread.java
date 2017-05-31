package cn.why.thread.join;



/**
 * 用于测试join方法的线程
 *
 * @author why
 * @date 2017/5/31 15:21
 */
public class MyThread implements Runnable{

//    步骤：

// 1.定义实现Runnable接口
//
// 2.覆盖Runnable接口中的run方法，将线程要运行的代码存放在run方法中。
//
//            3.通过Thread类建立线程对象。
//
//            4.将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数。
//
//    为什么要讲Runnable接口的子类对象传递给Thread的构造方法。因为自定义的方法的所属的对象是Runnable接口的子类对象。
//
//            5.调用Thread类的start方法开启线程并调用Runnable接口子类run方法。
    @Override
    public void run() {

        int secondValue = (int) (Math.random() * 1000);
        System.out.println("secondValue = " + secondValue);
        try {
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
