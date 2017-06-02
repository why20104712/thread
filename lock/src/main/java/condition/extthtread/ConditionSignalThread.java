package condition.extthtread;

import condition.service.ConditionService;

public class ConditionSignalThread extends Thread {


    private ConditionService conditionService;

    public ConditionSignalThread(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @Override
    public void run() {
        conditionService.signal();
    }
}
