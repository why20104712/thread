package condition.extthtread;

import condition.service.ConditionService;

public class ConditionSignalAThread extends Thread {


    private ConditionService conditionService;

    public ConditionSignalAThread(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @Override
    public void run() {
        conditionService.signalA();
    }
}
