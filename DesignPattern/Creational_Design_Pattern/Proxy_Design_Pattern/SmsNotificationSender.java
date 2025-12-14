package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

public class SmsNotificationSender implements NotificationSender {
    public void send(String msg) {
        System.out.println("SMS sent: " + msg);
    }
}

