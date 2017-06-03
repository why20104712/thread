package condition.test;

import condition.extthtread.ConditionAwaitAThread;
import condition.extthtread.ConditionAwaitBThread;
import condition.extthtread.ConditionSignalAThread;
import condition.service.ConditionService;

public class ConditionTest {

    public static void main(String[] args) {

        ConditionService conditionService = new ConditionService();

        ConditionAwaitAThread conditionAwaitAThread = new ConditionAwaitAThread(conditionService);
        conditionAwaitAThread.setName("conditionAwaitAThread");
        conditionAwaitAThread.start();

        ConditionAwaitBThread conditionAwaitBThread = new ConditionAwaitBThread(conditionService);
        conditionAwaitBThread.setName("conditionAwaitBThread");
        conditionAwaitBThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ConditionSignalAThread conditionSignalAThread = new ConditionSignalAThread(conditionService);
        conditionSignalAThread.setName("conditionSignalAThread");
        conditionSignalAThread.start();


    }


}
