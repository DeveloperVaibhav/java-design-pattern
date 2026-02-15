package com.designpattern.creational.abstractfactory;

public class UserEmailNotification implements EmailNotification{

    @Override
    public void notifyUser() {
        System.out.println("Sending user email notification...");
    }
}
