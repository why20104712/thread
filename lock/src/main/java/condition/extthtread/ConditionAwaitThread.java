package condition.extthtread;

import condition.service.ConditionService;

public class ConditionAwaitThread extends Thread {


    private ConditionService conditionService;

    public ConditionAwaitThread(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @Override
    public void run() {
        conditionService.await();
    }
}
