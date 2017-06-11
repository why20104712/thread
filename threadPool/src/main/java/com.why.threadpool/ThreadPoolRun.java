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



    }

}
