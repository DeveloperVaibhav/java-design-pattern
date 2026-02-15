package com.designpattern.creational.abstractfactory;

public interface NotificationFactory {

    EmailNotification createEmailNotification();
    SmsNotification createSmsNotification();
}
