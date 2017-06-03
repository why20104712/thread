package condition.extthtread;

import condition.service.ConditionService;

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
