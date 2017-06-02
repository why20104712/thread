package condition.test;

import condition.extthtread.ConditionAwaitThread;
import condition.extthtread.ConditionSignalThread;
import condition.service.ConditionService;

public class ConditionTest {

    public static void main(String[] args) {

        ConditionService conditionService = new ConditionService();

        ConditionAwaitThread conditionAwaitThread = new ConditionAwaitThread(conditionService);
        conditionAwaitThread.setName("conditionAwaitThread");
        conditionAwaitThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ConditionSignalThread conditionSignalThread = new ConditionSignalThread(conditionService);
        conditionSignalThread.setName("conditionSignalThread");
        conditionSignalThread.start();


    }


}
