package com.why.thread.condition.extthtread;


import com.why.thread.condition.service.ConditionService;

public class ConditionAwaitAThread extends Thread {


    private ConditionService conditionService;

    public ConditionAwaitAThread(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @Override
    public void run() {
        conditionService.awaitA();
    }
}
