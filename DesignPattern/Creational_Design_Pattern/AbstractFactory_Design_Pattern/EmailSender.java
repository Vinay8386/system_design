package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

