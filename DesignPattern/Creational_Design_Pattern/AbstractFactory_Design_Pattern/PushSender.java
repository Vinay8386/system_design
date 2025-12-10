package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

public class PushSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}

