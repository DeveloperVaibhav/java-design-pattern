package com.designpattern.creational.abstractfactory;

public class AdminEmailNotification implements EmailNotification{

    @Override
    public void notifyUser() {
        System.out.println("Sending admin email notification...");
    }
}
