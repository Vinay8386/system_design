package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

public class PushNotificationSender implements NotificationSender {
    public void send(String msg) {
        System.out.println("PUSH sent: " + msg);
    }
}

