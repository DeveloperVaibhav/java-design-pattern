package com.designpattern.creational.singleton.billpugh;

public class DemoLogger {

    //private constructor to prevent external instantiation
    private DemoLogger(){
        System.out.println("Logger is initialized - Bill Pugh...");
    }

    //Static inner class hold the single instance
    //This inner class is not loaded until getInstance is called (lazy init)
    //This provides lazy initialization and is threadsafe without synchronized
    private static class SingletonHelper{
        private static final DemoLogger INSTANCE = new DemoLogger();
    }

    //public method to return the single instance
    public static DemoLogger getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public void logMessage(String message){
        System.out.println("LOG: "+ message);
    }
}
