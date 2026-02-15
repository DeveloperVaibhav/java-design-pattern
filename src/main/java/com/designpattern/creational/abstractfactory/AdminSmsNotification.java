package com.designpattern.creational.abstractfactory;

public class AdminSmsNotification implements SmsNotification{

    @Override
    public void notifyUser() {
        System.out.println("Sending admin sms notification...");
    }
}
