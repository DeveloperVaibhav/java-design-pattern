package com.designpattern.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        NotificationFactory factory;
        EmailNotification emailNotification;
        SmsNotification smsNotification;

        //set up for user
        factory = new UserNotificationFactory();
        emailNotification = factory.createEmailNotification();
        emailNotification.notifyUser();
        smsNotification = factory.createSmsNotification();
        smsNotification.notifyUser();

        System.out.println("===============================");

        //set up for admin
        factory = new AdminNotificationFactory();
        emailNotification = factory.createEmailNotification();
        emailNotification.notifyUser();
        smsNotification = factory.createSmsNotification();
        smsNotification.notifyUser();
    }
}
