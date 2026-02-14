package com.designpattern.creational.initial;

public class NotificationService {

    public void sendNotification(String type){

        if(type.equalsIgnoreCase("email")){
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.send();
        } else if (type.equalsIgnoreCase("sms")) {
            SmsNotification smsNotification = new SmsNotification();
            smsNotification.send();
        } else if (type.equalsIgnoreCase("whatsapp")) {
            WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
            whatsAppNotification.send();
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
