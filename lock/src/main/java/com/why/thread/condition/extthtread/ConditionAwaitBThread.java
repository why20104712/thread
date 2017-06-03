package com.why.thread.condition.extthtread;


import com.why.thread.condition.service.ConditionService;

public class ConditionAwaitBThread extends Thread {


    private ConditionService conditionService;

    public ConditionAwaitBThread(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @Override
    public void run() {
        conditionService.awaitB();
    }
}
