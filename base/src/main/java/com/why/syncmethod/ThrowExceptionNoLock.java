package com.why.syncmethod;

import org.apache.commons.codec.binary.StringUtils;

/**
 * 出现异常，锁会自动释放
 * @author why
 * @date 2017/4/24 13:49
 */
public class ThrowExceptionNoLock {

    public synchronized void throwExceptionNoLock() {
        if (StringUtils.equals("a", Thread.currentThread().getName())) {
            System.out.println("threadName = " + Thread.currentThread().getName() + " run time " + System.currentTimeMillis());

            int i = 1;
            while (i == 1) {
                if ((Math.random() + "").substring(0, 8).equals("0.123456")) {
                    System.out.println("threadName = " + Thread.currentThread().getName() + " run exception " + System.currentTimeMillis());
                }
                Integer.valueOf("a");
            }

        } else {
            System.out.println("threadName = " + Thread.currentThread().getName() + " run time " + System.currentTimeMillis());
        }
    }

}
