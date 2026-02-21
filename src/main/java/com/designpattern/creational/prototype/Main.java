package com.designpattern.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        EmailTemplate baseTemplate = new EmailTemplate("Report update","Hello!,This is your monthly update", "Regards, XYZ");
        System.out.println("Base Template: " +baseTemplate);
        System.out.println("============================");

        // group email
        System.out.println("SENDING GROUP EMAIL");
        EmailTemplate groupEmail = (EmailTemplate) baseTemplate.clone();
        groupEmail.setBody("Hello Team!,This is your monthly update");
        groupEmail.sendEmail("group@gmai.com");
        System.out.println("============================");

        // individual email
        System.out.println("SENDING INDIVIDUAL EMAIL");
        EmailTemplate individualEmail = (EmailTemplate) baseTemplate.clone();
        individualEmail.setBody("Hello Vaibhav!,This is your monthly update");
        individualEmail.sendEmail("vaibhav.@gmail.com");
    }
}
