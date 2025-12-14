package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

public class EmailNotificationSender implements NotificationSender {
    public void send(String msg) {
        System.out.println("EMAIL sent: " + msg);
    }
}

