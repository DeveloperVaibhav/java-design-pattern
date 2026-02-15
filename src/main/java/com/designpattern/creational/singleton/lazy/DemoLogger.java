package com.designpattern.creational.singleton.lazy;

public class DemoLogger {

    //static variable to hold single instance
    private static DemoLogger instance;

    //private constructor to prevent external instantiation
    private DemoLogger(){
        System.out.println("Logger is initialized lazy...");
    }

    //public method to return the single instance (with lazy initialization)
    public static DemoLogger getInstance(){
        //create instance if it doesn't exist
        if(instance == null){
            instance = new DemoLogger();
        }
        return instance;
    }

    public void logMessage(String message){
        System.out.println("LOG: "+ message);
    }
}
