package com.designpattern.creational.singleton.eager;

public class DemoLogger {

    //static variable to hold single instance
    private static DemoLogger instance = new DemoLogger();

    //private constructor to prevent external instantiation
    private DemoLogger(){
        System.out.println("Logger is initialized eagerly...");
    }

    //public method to return the single instance
    public static DemoLogger getInstance(){
        return instance;
    }

    public void logMessage(String message){
        System.out.println("LOG: "+ message);
    }
}
