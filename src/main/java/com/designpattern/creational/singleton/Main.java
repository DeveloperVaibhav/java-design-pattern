package com.designpattern.creational.singleton;

public class Main {

    public static void main(String[] args) {

        DemoLogger instance1 = DemoLogger.getInstance();
        instance1.log("Welcome to singleton design demo!");

        DemoLogger instance2 = DemoLogger.getInstance();
        instance2.log("Great Learning!");

        boolean flag = (instance1 == instance2);
        System.out.println("Are both the instances same? " + flag);
    }
}
