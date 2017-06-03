package com.why.thread.condition.extthtread;


import com.why.thread.condition.service.ConditionService;

public class ConditionSignalBThread extends Thread {


    private ConditionService conditionService;

    public ConditionSignalBThread(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @Override
    public void run() {
        conditionService.signalB();
    }
}
