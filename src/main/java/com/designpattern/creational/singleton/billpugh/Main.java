package com.designpattern.creational.singleton.billpugh;

public class Main {

    public static void main(String[] args) {

        DemoLogger instance1 = DemoLogger.getInstance();
        instance1.logMessage("Welcome to singleton design demo!");

        DemoLogger instance2 = DemoLogger.getInstance();
        instance2.logMessage("Great Learning!");

        boolean flag = (instance1 == instance2);
        System.out.println("Are both the instances same? " + flag);
    }
}
