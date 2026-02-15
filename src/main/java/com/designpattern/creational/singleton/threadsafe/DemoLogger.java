package com.designpattern.creational.singleton.threadsafe;

public class DemoLogger {

    //static variable to hold single instance
    private static DemoLogger instance;

    //private constructor to prevent external instantiation
    private DemoLogger(){
        System.out.println("Logger is initialized - synchronized way...");
    }

    //public method to return the single instance (synchronized with Double Checked locking pattern)
    public static DemoLogger getInstance(){
        if (instance == null) {
            synchronized (DemoLogger.class) {
                //create instance if it doesn't exist
                if (instance == null) {
                    instance = new DemoLogger();
                }
            }
        }
        return instance;
    }

    public void logMessage(String message){
        System.out.println("LOG: "+ message);
    }
}
