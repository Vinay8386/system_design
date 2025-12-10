package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

