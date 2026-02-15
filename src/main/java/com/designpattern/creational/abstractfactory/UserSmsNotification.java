package com.designpattern.creational.abstractfactory;

public class UserSmsNotification implements SmsNotification{

    @Override
    public void notifyUser() {
        System.out.println("Sending user sms notification...");
    }
}
