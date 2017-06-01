package com.why.service;

import com.why.countdownlatch.service.verifier.BaseHealthChecker;
import com.why.countdownlatch.service.verifier.CacheHealthChecker;
import com.why.countdownlatch.service.verifier.DatabaseHealthChecker;
import com.why.countdownlatch.service.verifier.NetworkHealthChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ApplicationStartupUtil {
    private static List<BaseHealthChecker> services;
    private static CountDownLatch countDownLatch;

    private ApplicationStartupUtil() {
    }

    private final static ApplicationStartupUtil INSTANCE = new ApplicationStartupUtil();

    public static ApplicationStartupUtil getInstance() {
        return INSTANCE;
    }

    public static boolean checkExternalServices() throws Exception {
        countDownLatch = new CountDownLatch(3);
        services = new ArrayList<BaseHealthChecker>();
        services.add(new NetworkHealthChecker(countDownLatch));
        services.add(new CacheHealthChecker(countDownLatch));
        services.add(new DatabaseHealthChecker(countDownLatch));

        Executor executor = Executors.newFixedThreadPool(services.size());

        for (final BaseHealthChecker v : services) {
            executor.execute(v);
        }

        countDownLatch.await();

        for (final BaseHealthChecker v : services) {
            if (!v.isServiceUp()) {
                return false;
            }
        }
        return true;
    }


}
