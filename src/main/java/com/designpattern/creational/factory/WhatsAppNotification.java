package com.designpattern.creational.factory;

public class WhatsAppNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending WhatsApp notification...");
    }
}
