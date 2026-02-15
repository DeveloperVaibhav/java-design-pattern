package com.designpattern.creational.abstractfactory;

public class UserNotificationFactory implements NotificationFactory{

    @Override
    public EmailNotification createEmailNotification() {
        return new UserEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotification() {
        return new UserSmsNotification();
    }
}
