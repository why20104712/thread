package cn.why.thread;

public class Run {

    public static void main(String[] args) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
//        String name = threadGroup.getName();
//        System.out.println(name);

//        ThreadGroup parent = threadGroup.getParent();
//        System.out.println(parent.getName());


//        getParent(threadGroup);

        System.out.println(threadGroup.activeCount());
        System.out.println(threadGroup.activeGroupCount());
    }

    /**
     * 递归获取线程组的上级
     * @param threadGroup
     */
    public static void getParent(ThreadGroup threadGroup) {
        if (null != threadGroup) {
            System.out.println(threadGroup.getName());
            System.out.println(threadGroup.getParent());
            System.out.println(threadGroup.getMaxPriority());
            getParent(threadGroup.getParent());
        }

    }
}
