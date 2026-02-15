package com.designpattern.creational.abstractfactory;

public class AdminNotificationFactory implements NotificationFactory{

    @Override
    public EmailNotification createEmailNotification() {
        return new AdminEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotification() {
        return new AdminSmsNotification();
    }
}
