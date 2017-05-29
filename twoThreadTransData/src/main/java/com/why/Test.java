package com.why;

/**
 * 测试
 */
public class Test {

    public static void main(String[] args) {

        MyList myList = new MyList();
        ThreadA threadA = new ThreadA(myList);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(myList);
        threadB.setName("B");
        threadB.start();

//        String a = (String) null;
//        System.out.println(a);


    }

}
