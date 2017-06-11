package com.why.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 线程池使用
 * @author why
 * @date 2017/6/11 17:15
 */
public class ThreadPoolRun {


    public static void main(String[] args) {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3);


        /**
         * 线程池工作流程
         * 、如果线程池中的线程小于corePoolSize时就会创建新线程直接执行任务。

         2、如果线程池中的线程大于corePoolSize时就会暂时把任务存储到工作队列workQueue中等待执行。

         3、如果工作队列workQueue也满时：当线程数小于最大线程池数maximumPoolSize时就会创建新线程来处理，而线程数大于等于最大线程池数maximumPoolSize时就会执行拒绝策略。
         */



        /**
         * 固定线程数量的线程池
         */
        ExecutorService executorService = Executors.newFixedThreadPool(3);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("线程输出");
            }
        });

        /**
         * 线程执行,有返回值
         */
        Future<?> future = executorService.submit(thread);
        try {
            Object o = future.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        /**
         * 线程执行，无返回值
         */
        executorService.execute(thread);


        /**
         * 关闭线程池
         * 不再接受新的任务，之前提交的任务等执行结束再关闭线程池。
         */
        executorService.shutdown();

        /**
         * 不再接受新的任务，试图停止池中的任务再关闭线程池，返回所有未处理的线程list列表。
         */
        executorService.shutdownNow();



    }

}
