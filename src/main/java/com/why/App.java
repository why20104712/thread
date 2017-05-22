package com.why;

public class App {


    public static void main(String[] args) {
        String[] split = "JOGUO".split("\\+");
        int length = split.length;
        if (length >= 1) {
           String trName = split[0];
            System.out.println(trName);
        }


    }
}
